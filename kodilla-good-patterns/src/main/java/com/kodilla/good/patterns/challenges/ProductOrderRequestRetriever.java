package com.kodilla.good.patterns.challenges;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("John", "Wekl");
        Product product = new Product("Bicycle", 1099.99);

        return new ProductOrderRequest(user, product);
    }
}
