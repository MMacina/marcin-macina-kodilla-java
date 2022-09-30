package com.kodilla.good.patterns.challenges.food2door;

import java.util.Scanner;

public class InformationServiceExecutor implements InformationService{
    @Override
    public void sendOrderInquiryToSupplier(OrderRequest orderRequest) {
        System.out.println("\nSending inquiry to: /" + orderRequest.getSupplier().getSupplierEmail() + "/\n...");
        System.out.println("Dear Supplier, we've received order:\n" + orderRequest);
    }

    @Override
    public void confirmOrderToCustomer(OrderRequest orderRequest) {
        System.out.println("Dear " + orderRequest.getCustomer().getCustomerName() + ", your order has been confirmed and is being processed at the moment.");
    }

    @Override
    public void rejectOrderToCustomer(OrderRequest orderRequest) {
        System.out.println("Dear " + orderRequest.getCustomer().getCustomerName() + ", your order has been rejected by supplier.");
    }
}
