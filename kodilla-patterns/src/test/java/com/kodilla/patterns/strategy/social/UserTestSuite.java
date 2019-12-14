package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Frank");
        User yGeneration = new YGeneration("John");
        User zGeneration = new ZGeneration("Amelie");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Frank speak: " + mSocialPublisher);
        String ySocialPublisher = yGeneration.sharePost();
        System.out.println("John speak: " + ySocialPublisher);
        String zSocialPublisher = zGeneration.sharePost();
        System.out.println("Amelie speak: " + zSocialPublisher);

        //Then
        Assert.assertEquals("I use Twitter", mSocialPublisher);
        Assert.assertEquals("I use Facebook", ySocialPublisher);
        Assert.assertEquals("I use Snapchat", zSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Frank");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Frank speak: " + mSocialPublisher);
        millenials.setSocialPublisher(new FacebookPublisher());
        mSocialPublisher = millenials.sharePost();
        System.out.println("Frank now speak: " + mSocialPublisher);

        //Then
        Assert.assertEquals("I use Facebook", mSocialPublisher);
    }
}