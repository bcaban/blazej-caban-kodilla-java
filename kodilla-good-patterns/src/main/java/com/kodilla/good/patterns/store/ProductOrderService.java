package com.kodilla.good.patterns.store;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.println("User " + user.getUserName() + " ordered " + product.getProductQuantity() + " piece/s of "
                + product.getProductName() + "\n" + "Date of order: " + dateOfOrder.toString());

        return true;
    }
}
