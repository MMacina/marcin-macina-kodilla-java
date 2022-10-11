package com.kodilla.patterns.startegy;

public sealed interface BuyPredictor permits AggressivePredictor, BalancedPredictor, ConservativePredictor {

    String predictWhatToBuy();
}
