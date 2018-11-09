package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[]args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK.");
        }else {
            System.out.println("Error.");
        }

        System.out.println();
        System.out.println("Test - Pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(15, 10);

        int resultOfAdd = calculator.add();
        int resultOfSubtract = calculator.subtract();

        if (resultOfAdd == 25) {
            System.out.println("Test OK.");
        }else {
            System.out.println("Error.");
        }

        if (resultOfSubtract == 5) {
            System.out.println("Test OK.");
        }else {
            System.out.println("Error.");
        }



    }
}
