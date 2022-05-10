package com.kodilla.good.patterns.challenges.productorder;

public class ProductOrderProcessor {
    private final InformationService informationService;
    private final ProductOrderService productOrderService;
    private final ProductRepository productRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService,
                                 final ProductRepository productRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productRepository = productRepository;
    }

    public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
        boolean inStock;
        boolean isSold = false;

        //sprawdź czy jest w magazynie
        inStock = productRepository.isInStock(productOrderRequest.getProduct());

        //sprzedaj
        if (inStock) {
            isSold = productOrderService.order(productOrderRequest.getUser(), productOrderRequest.getProduct());
        }

        if (isSold) {
            informationService.inform(productOrderRequest.getUser());
            productRepository.createOrder(productOrderRequest.getUser(), productOrderRequest.getProduct());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
