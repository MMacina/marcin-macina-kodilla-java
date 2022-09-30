package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {
    private InformationService informationService;
    private OrderProcessor orderProcessor;

    public OrderService(InformationService informationService, OrderProcessor orderProcessor) {
        this.informationService = informationService;
        this.orderProcessor = orderProcessor;
    }

    public void process(final OrderRequest orderRequest) {
        if (orderProcessor.isOrdered(orderRequest)) {
            informationService.sendOrderInquiryToSupplier(orderRequest);
            if (orderProcessor.processOrder(orderRequest)) {
                informationService.confirmOrderToCustomer(orderRequest);
            } else {
                informationService.rejectOrderToCustomer(orderRequest);
            }
        } else {
            System.out.println("Dear Customer, your order is incomplete and can't be processed.");

        }
    }
}

