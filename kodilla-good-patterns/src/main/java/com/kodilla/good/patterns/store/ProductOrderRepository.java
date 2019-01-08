package com.kodilla.good.patterns.store;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime dateOfOrder) {
        return true;
    }
}
