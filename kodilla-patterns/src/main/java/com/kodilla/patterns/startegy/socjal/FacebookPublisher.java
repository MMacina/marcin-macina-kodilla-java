package com.kodilla.patterns.startegy.socjal;

public final class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "[Facebook Publisher] publish on Facebook.";
    }
}
