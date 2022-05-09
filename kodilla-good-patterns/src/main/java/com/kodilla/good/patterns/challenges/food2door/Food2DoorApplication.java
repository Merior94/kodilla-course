package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;

public class Food2DoorApplication {
    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest("Warzywa", 5, "ExtraFoodShop3");
        //OrderRequest orderRequest = new OrderRequest("Owoce", 5, "HealthyShop");
        //OrderRequest orderRequest = new OrderRequest("Napoje", 5, "GlutenFreeShop");

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(orderRequest);

    }
}
