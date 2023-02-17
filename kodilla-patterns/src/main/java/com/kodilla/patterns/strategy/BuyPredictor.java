package com.kodilla.patterns.strategy;

public sealed interface BuyPredictor
    permits BalancedPredictor, ConservativePredictor, AggressivePredictor {

    String predictWhatToBuy();
}
