package com.kodilla.patterns.startegy.socjal;

public final class Millennial extends User {

    public Millennial(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
