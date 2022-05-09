package com.kodilla.good.patterns.challenges.productorder;

public class ProductOrderService {

    public boolean order(final User user, final Product product) {

        System.out.println("Selling: " + product.getName() + " for " + product.getPrice() + "$ to: " + user.getFirstname() + " " + user.getLastname());

        return true;
    }

}
