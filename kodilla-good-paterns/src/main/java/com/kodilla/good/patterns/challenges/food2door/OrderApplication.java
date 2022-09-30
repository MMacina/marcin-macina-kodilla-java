package com.kodilla.good.patterns.challenges.food2door;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderService = new OrderService(new InformationServiceExecutor(), new OrderProcessorExecutor());
        orderService.process(orderRequest);
    }
}
