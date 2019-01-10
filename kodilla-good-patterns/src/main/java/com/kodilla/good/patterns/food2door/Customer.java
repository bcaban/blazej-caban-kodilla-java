package com.kodilla.good.patterns.food2door;

public class Customer {

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
