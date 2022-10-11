package com.kodilla.patterns.startegy.predictors;

public sealed interface BuyPredictor permits AggressivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();
}
