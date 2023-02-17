package com.kodilla.patterns.strategy.social;

public final class YGeneration extends User {

    public YGeneration(final String name) {
        super(name);
        this.setSocialPublisher(new SnapchatPublisher());
    }
}
