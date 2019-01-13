package com.kodilla.good.patterns.food2door;


import java.util.ArrayList;
import java.util.List;

public class OrderCreator {

    public Order createOrder1() {

        Customer customer = new Customer("John");

        List<Product> products = new ArrayList<>();
        products.add(new Product("Apples", 2));
        products.add(new Product("Bananas", 2));
        products.add(new Product("Carrots", 6));
        products.add(new Product("Bread", 2));
        products.add(new Product("Pasta", 3));
        products.add(new Product("Cookies", 3));
        products.add(new Product("Caviar", 2));
        products.add(new Product("Beef", 2));
        products.add(new Product("Truffles", 2));

        return new Order(customer, products);
    }
}
