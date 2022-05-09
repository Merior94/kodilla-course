package com.kodilla.good.patterns.challenges.productorder;

import com.kodilla.good.patterns.challenges.productorder.User;

public class InformationService {

    public void inform(User user){
        System.out.println(user.getFirstname() + " " + user.getLastname() + " - Your order was registered successfully!");
    }
}
