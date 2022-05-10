package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends Manufacturer {
    public GlutenFreeShop() {
        super("GlutenFreeShop");
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Wysyłam zamówienie listownie");

        orderCompleted(orderRequest);
    }
}