package com.kodilla.good.patterns.challenges.orderService;

public class OrderServiceProcessor implements OrderService {

    @Override
    public boolean processOrder(User user, Product product, int quantity) {
        if (user != null && product != null && quantity > 0) {
            System.out.println("\nProcessing order placed by: " + user + ". \nOrdered item: " + product + ". Quantity: " + quantity);
            return true;
        } else {
            System.out.println("Incorrect order request");
            return false;
        }
    }
}

