package com.kodilla.good.patterns.challenges;

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
        //sprawdź czy jest w magazynie
        boolean inStock = productRepository.isInStock(productOrderRequest.getProduct());

        //sprzedaj
        productOrderService.order(productOrderRequest.getUser(), productOrderRequest.getProduct());


        if (inStock) {
            informationService.inform(productOrderRequest.getUser());
            productRepository.order(productOrderRequest.getUser(), productOrderRequest.getProduct());
            return new ProductOrderDto(productOrderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(productOrderRequest.getUser(), false);
        }
    }
}
