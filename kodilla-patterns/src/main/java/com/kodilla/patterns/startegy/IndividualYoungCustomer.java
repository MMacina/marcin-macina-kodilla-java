package com.kodilla.patterns.startegy;

public final class IndividualYoungCustomer extends Customer{

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
