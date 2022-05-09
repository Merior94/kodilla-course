package com.kodilla.good.patterns.challenges.productorder;

public class User {
    private final String firstname;
    private final String lastname;

    public User(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
