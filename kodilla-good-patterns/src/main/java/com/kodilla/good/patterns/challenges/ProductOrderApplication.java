package com.kodilla.good.patterns.challenges;

public class ProductOrderApplication {
    public static void main(String[] args) {
        //zamówienie
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever(); //Nowe zamówienie
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();  //dane zamówienia

        //usługa
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                new InformationService(), new ProductOrderService(), new ProductRepository());

        //procesowanie zamówienia
        productOrderProcessor.process(productOrderRequest);
    }
}
