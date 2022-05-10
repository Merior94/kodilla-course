package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Manufacturer {
    public ExtraFoodShop() {
        super("ExtraFoodShop");
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Wysyłam zamówienie gołębiem");

        orderCompleted(orderRequest);
    }
}
