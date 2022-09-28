package com.kodilla.good.patterns.challenges.orderService;

public interface OrderService {
    boolean processOrder(User user, Product product, int quantity);
}
