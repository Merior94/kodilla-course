package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Manufacturer {

    public HealthyShop() {
        super("HealthyShop");
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Wysyłam zamówienie mailem");

        orderCompleted(orderRequest);
    }
}
