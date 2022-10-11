package com.kodilla.patterns.strategy;

import com.kodilla.patterns.startegy.socjal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millennial("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldPublish = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPublish);
        String johnShouldPublish = john.sharePost();
        System.out.println("John should: " + johnShouldPublish);
        String kodillaShouldPublish = kodilla.sharePost();
        System.out.println("Kodilla should: " + kodillaShouldPublish);

        //Then
        assertEquals("[Facebook Publisher] publish on Facebook.", stevenShouldPublish);
        assertEquals("[Twitter Publisher] publish on Twitter.", johnShouldPublish);
        assertEquals("[Snapchat Publisher] publish on Snapchat.", kodillaShouldPublish);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millennial("Steven Links");

        //When
        String stevenShouldPublish = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPublish);
        steven.setPost(new TwitterPublisher());
        stevenShouldPublish = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldPublish);

        //Then
        assertEquals("[Twitter Publisher] publish on Twitter.", stevenShouldPublish);
    }

}
