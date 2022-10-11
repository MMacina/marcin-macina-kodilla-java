package com.kodilla.patterns.startegy.socjal;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "[Twitter Publisher] publish on Twitter.";
    }
}
