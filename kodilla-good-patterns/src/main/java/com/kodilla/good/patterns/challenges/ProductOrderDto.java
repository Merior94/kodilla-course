package com.kodilla.good.patterns.challenges;

public class ProductOrderDto {
    private final User user;
    private final boolean isOrdered;

    public ProductOrderDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
