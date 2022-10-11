package com.kodilla.patterns.startegy.socjal;

public final class YGeneration extends User{

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
