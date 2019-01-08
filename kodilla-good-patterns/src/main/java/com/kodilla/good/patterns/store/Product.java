package com.kodilla.good.patterns.store;

public class Product {
    private String productName;
    private int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productquantity=" + productQuantity +
                '}';
    }
}
