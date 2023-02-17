package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Milenialny Maciek");
        User zGeneration = new ZGeneration("Twitterowy Tomek");
        User yGeneration = new YGeneration("Snapczatowy Sylwester");

        //When & Then
        Assertions.assertEquals("facebook", millenials.getSocialPublisher().share());
        Assertions.assertEquals("twitter", zGeneration.getSocialPublisher().share());
        Assertions.assertEquals("snapchat", yGeneration.getSocialPublisher().share());
    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Milenialny Maciek");

        //When
        millenials.setSocialPublisher(new TwitterPublisher());

        //Then
        Assertions.assertEquals("twitter", millenials.getSocialPublisher().share());
    }
}
