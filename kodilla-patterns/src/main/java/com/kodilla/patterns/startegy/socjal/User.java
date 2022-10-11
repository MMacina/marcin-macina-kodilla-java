package com.kodilla.patterns.startegy.socjal;

public sealed class User permits Millennial, YGeneration, ZGeneration{

    public final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setPost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
