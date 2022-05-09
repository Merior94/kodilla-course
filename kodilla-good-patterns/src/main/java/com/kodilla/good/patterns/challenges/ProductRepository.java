package com.kodilla.good.patterns.challenges;

public class ProductRepository {

    public void order(User user, Product product){
        System.out.println("Product " + product.getName() + " was reserved for client " + user.getFirstname() + " " + user.getLastname());
    }

    public boolean isInStock(Product product){
        return true;
    }
}
