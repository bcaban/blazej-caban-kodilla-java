package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private List<Product> products = new ArrayList<>();
    private boolean isCompleted = true;

    public OrderDto() {
    }

    public void addProduct(Product product) {
        products.add(product);

    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "products=" + products +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
