package com.kodilla.good.patterns.store;

public class OrderDTO {

    private User user;
    private Product product;
    private boolean isOrdered;

    public OrderDTO(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "user=" + user +
                ", product=" + product +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
