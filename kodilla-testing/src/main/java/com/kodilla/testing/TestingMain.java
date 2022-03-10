package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowdzanie do testowania oprogramwowania");

        //First unit test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator unit test
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 6;
        if (calculator.add(a,b) == (a+b)){
            System.out.println("Calculator.add() OK");
        } else {
            System.out.println("Calculator.add() failed!");
        }

        if (calculator.substract(a,b) == (a-b)){
            System.out.println("Calculator.substract() OK");
        } else {
            System.out.println("Calculator.substract() failed!");
        }

    }
}
