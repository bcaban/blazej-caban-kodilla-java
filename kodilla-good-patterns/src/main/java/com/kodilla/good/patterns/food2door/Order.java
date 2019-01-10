package com.kodilla.good.patterns.food2door;

import java.util.List;

public class Order {

    private Customer customer;
    private List<Product> productList;

    public Order(Customer customer, List<Product> productList) {
        this.customer = customer;
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

}
