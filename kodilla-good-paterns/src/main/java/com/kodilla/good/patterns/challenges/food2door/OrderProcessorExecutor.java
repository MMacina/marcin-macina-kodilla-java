package com.kodilla.good.patterns.challenges.food2door;

import java.util.Scanner;

public class OrderProcessorExecutor implements OrderProcessor{

    @Override
    public boolean isOrdered(OrderRequest orderRequest) {
        if (orderRequest.getCustomer() != null && orderRequest.getSupplier() != null && orderRequest.getItem() != null && orderRequest.getQuantity()>0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean processOrder(OrderRequest orderRequest) {
        System.out.println("To confirm order inquiry please press \"c\". To reject order pres any other key.");
        String confirmationMark = new Scanner(System.in).nextLine();
        if (confirmationMark.equals("c")){
            System.out.println("...\nOrder has been confirmed\n...");
            return true;
        } else {
            System.out.println("...\nOrder has been rejected\n...");
            return false;
        }
    }
}
