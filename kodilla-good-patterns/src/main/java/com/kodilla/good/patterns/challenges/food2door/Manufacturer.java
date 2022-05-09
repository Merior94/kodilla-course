package com.kodilla.good.patterns.challenges.food2door;

public abstract class Manufacturer {
    private final String name;

    public Manufacturer(String name) {
        this.name = name;
    }

    public abstract void process(OrderRequest orderRequest);

    public void orderCompleted(OrderRequest orderRequest) {
        System.out.println("Złożono zamówienie na " + orderRequest.getName() + " u producenta " + this.name);
    }

    public String getName() {
        return name;
    }
}
