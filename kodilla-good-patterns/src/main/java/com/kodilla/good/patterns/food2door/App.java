package com.kodilla.good.patterns.food2door;

public class App {

    public static void main(String args[]) {

        OrderCreator orderCreator1 = new OrderCreator();
        Order order1 = orderCreator1.createOrder1();

        OrderProcess orderProcess1 = new OrderProcess();

        orderProcess1.process(order1);

    }
}