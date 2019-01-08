package com.kodilla.good.patterns.store;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John");
        Product product = new Product("Game Pad", 2);
        LocalDateTime orderDate = LocalDateTime.of(2019, 1, 10, 10, 10);

        return new OrderRequest(user, product, orderDate);

    }
}
