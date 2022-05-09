package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Manufacturer{

    public HealthyShop() {
        super("HealthyShop");
    }

    @Override
    public void process(OrderRequest orderRequest){
        if (orderRequest.getManufacturer().equals(super.getName())) {

            System.out.println("Wysyłam zamówienie mailem");

            orderCompleted(orderRequest);
        }
    }
}
