package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private final String name;
    private final int amount;
    private final String manufacturer;

    public OrderRequest(String name, int amount, String manufacturer) {
        this.name = name;
        this.amount = amount;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
