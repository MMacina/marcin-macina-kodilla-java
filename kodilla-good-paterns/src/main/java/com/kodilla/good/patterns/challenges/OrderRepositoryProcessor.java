package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class OrderRepositoryProcessor implements OrderRepository{
    @Override
    public Map<User, OrderRequest> registerOrder(OrderRequest orderRequest) {

        Map<User, OrderRequest> orderRepositoryMap = new HashMap<>();
        orderRepositoryMap.put(orderRequest.getUser(), orderRequest);

        if (orderRepositoryMap.isEmpty()) {
            System.out.println("Order registration failed!!!");
        } else {
            System.out.println("System notice:\nOrder placed by '" + orderRequest.getUser().getUserName() + "' has been successfully registered.");
        }

        return orderRepositoryMap;
    }
}
