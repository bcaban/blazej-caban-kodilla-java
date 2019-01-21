package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User mike = new ZGeneration("Mike Smith");

        //When
        String stevenPrefers = steven.sharePost();
        System.out.println("Steven prefers " + stevenPrefers);
        String johnPrefers = john.sharePost();
        System.out.println("John prefers " + johnPrefers);
        String mikePrefers = mike.sharePost();
        System.out.println("Mike prefers " + mikePrefers);

        //Than
        Assert.assertEquals("Facebook", stevenPrefers);
        Assert.assertEquals("Twitter", johnPrefers);
        Assert.assertEquals("Snapchat", mikePrefers);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPrefers = steven.sharePost();
        System.out.println("Steven prefers " + stevenPrefers);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenPrefers = steven.sharePost();
        System.out.println("Steven now prefers " + stevenPrefers);

        //Than
        Assert.assertEquals("Twitter", stevenPrefers);
    }
}
