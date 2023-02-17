package com.kodilla.patterns.strategy.social;

public final class Millenials extends User {

    public Millenials(final String name) {
        super(name);
        this.setSocialPublisher(new FacebookPublisher());
    }
}
