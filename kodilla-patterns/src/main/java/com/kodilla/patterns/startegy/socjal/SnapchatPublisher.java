package com.kodilla.patterns.startegy.socjal;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "[Snapchat Publisher] publish on Snapchat.";
    }
}
