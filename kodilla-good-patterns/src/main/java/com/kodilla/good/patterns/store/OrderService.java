package com.kodilla.good.patterns.store;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, Product product, LocalDateTime dateOfOrder);
}
