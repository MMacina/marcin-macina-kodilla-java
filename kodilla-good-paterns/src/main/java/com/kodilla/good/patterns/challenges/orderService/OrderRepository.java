package com.kodilla.good.patterns.challenges.orderService;

import java.util.Map;

public interface OrderRepository {
    Map<User, OrderRequest> registerOrder(OrderRequest orderRequest);
}
