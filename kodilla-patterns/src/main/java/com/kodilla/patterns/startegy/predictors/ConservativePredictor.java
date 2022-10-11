package com.kodilla.patterns.startegy.predictors;

import com.kodilla.patterns.startegy.predictors.BuyPredictor;

public final class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
