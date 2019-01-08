package com.kodilla.good.patterns.store;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, Product product, LocalDateTime dateOfOrder);
}
