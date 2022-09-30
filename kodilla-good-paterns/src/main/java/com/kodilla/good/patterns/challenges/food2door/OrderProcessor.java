package com.kodilla.good.patterns.challenges.food2door;

public interface OrderProcessor {
    boolean isOrdered(OrderRequest orderRequest);
    boolean processOrder(OrderRequest orderRequest);
}
