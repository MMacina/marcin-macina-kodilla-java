package com.kodilla.patterns.startegy.socjal;

public sealed interface SocialPublisher permits FacebookPublisher, TwitterPublisher,SnapchatPublisher {

    String share();
}
