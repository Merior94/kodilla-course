package com.kodilla.good.patterns.challenges.productorder;

public class ProductOrderRequest {
    private final User user;
    private final Product product;

    public ProductOrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
