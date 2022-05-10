package com.kodilla.good.patterns.challenges.productorder;

public class ProductRepository {

    public void createOrder(User user, Product product){
        System.out.println("Product " + product.getName() + " was reserved for client " + user.getFirstname() + " " + user.getLastname());
    }

    public boolean isInStock(Product product){
        return true;
    }
}
