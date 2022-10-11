package com.kodilla.patterns.startegy;

public final class IndividualCustomer extends Customer{

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
