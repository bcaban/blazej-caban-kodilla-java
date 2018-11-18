package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(50);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int usersNumbers = calculateStatistics.getUsersNumber();
        int postsNumbers = calculateStatistics.getPostNumbers();
        int commentNumbers = calculateStatistics.getCommentsNumbers();
        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(5, usersNumbers);
        Assert.assertEquals(25, postsNumbers);
        Assert.assertEquals(50, commentNumbers);
        Assert.assertEquals(5, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(10, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(2, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testPostsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(50);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(0, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(10, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(0, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testPostsEqualsThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(200, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(10, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(0.05, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testCommentsEqualsHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(25);
        when(statisticsMock.commentsCount()).thenReturn(100);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(5, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(20, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(4, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testCommentsLowerThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(15);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(10, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(3, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(0.3, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testCommentsHigherThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        names.add("Kuba");
        names.add("Kamil");
        names.add("Wojtek");
        names.add("Adam");
        names.add("Lukasz");


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(35);
        when(statisticsMock.commentsCount()).thenReturn(250);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(7, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(50, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(7.142, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testUsersEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(15);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(0, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(0.3, averageNumberOfCommentsPerPost, 0.001);
    }

    @Test
    public void testUsersEqualsHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        List<String> names = new ArrayList<>();
        for(int n=0; n <100; n++) {
            names.add("User" + n);
        }


        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(15);


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        double averageNumberOfPostsPerUser = calculateStatistics.getAverageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();


        //Then
        Assert.assertEquals(0.5, averageNumberOfPostsPerUser, 0.001);
        Assert.assertEquals(0.15, averageNumberOfCommentsPerUser, 0.001);
        Assert.assertEquals(0.3, averageNumberOfCommentsPerPost, 0.001);
    }






}
