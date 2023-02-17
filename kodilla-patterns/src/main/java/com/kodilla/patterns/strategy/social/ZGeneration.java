package com.kodilla.patterns.strategy.social;

public final class ZGeneration extends User {

    public ZGeneration(final String name) {
        super(name);
        this.setSocialPublisher(new TwitterPublisher());
    }
}
