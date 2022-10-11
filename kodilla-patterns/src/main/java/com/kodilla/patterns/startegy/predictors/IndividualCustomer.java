package com.kodilla.patterns.startegy.predictors;

import com.kodilla.patterns.startegy.predictors.ConservativePredictor;
import com.kodilla.patterns.startegy.predictors.Customer;

public final class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
