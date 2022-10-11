package com.kodilla.patterns.startegy;

import com.kodilla.patterns.startegy.BuyPredictor;

public final class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
