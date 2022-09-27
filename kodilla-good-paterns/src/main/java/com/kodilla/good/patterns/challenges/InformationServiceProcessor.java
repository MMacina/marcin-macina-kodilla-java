package com.kodilla.good.patterns.challenges;

public class InformationServiceProcessor implements InformationService {
    @Override
    public void sendConfirmation(OrderRequest orderRequest) {
        System.out.println("...\nSending confirmation to: " + orderRequest.getUser().getUserEmail() + "\n" +
                "\"Dear " + orderRequest.getUser().getUserName() + ", we are processing your order for: " + orderRequest.getProduct() + " , quantity: " + orderRequest.getQuantity() + ".\n" +
                "Your order will be sent soon.\"\n...");
    }
}

