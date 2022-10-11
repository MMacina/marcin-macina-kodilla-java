package com.kodilla.patterns.startegy.predictors;

import com.kodilla.patterns.startegy.predictors.AggressivePredictor;
import com.kodilla.patterns.startegy.predictors.Customer;

public final class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
