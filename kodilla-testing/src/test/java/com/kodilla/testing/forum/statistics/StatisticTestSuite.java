package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

    @Mock
    private Statistics statisticsMock;

    StatisticsCounter statisticsCounter = new StatisticsCounter();
    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            resultList.add("Name" + n);
        }
        return resultList;
    }
    List<String> listOf0Users = new ArrayList<>();
    List<String> listOf100Users = generateListOfNUsers(100);

    @Test
    @DisplayName("0 users, 0 posts, 0 comments")
    void calculateAdvStatisticsTest0Users0Posts0Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("0 users, 0 posts, -500 comments")
    void calculateAdvStatisticsTest0Users0PostsMinus500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(-500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("0 users, 0 posts, 500 comments")
    void calculateAdvStatisticsTest0Users0Posts500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("0 users, 1000 posts, 0 comments")
    void calculateAdvStatisticsTest0Users1000Posts0Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("0 users, 1000 posts, 500 comments")
    void calculateAdvStatisticsTest0Users1000Posts500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("0 users, 1000 posts, 1500 comments")
    void calculateAdvStatisticsTest0Users1000Posts1500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 0 posts, 0 comments")
    void calculateAdvStatisticsTest100Users0Posts0Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 0 posts, -500 comments")
    void calculateAdvStatisticsTest100Users0PostsMinus500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(-500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 0 posts, 500 comments")
    void calculateAdvStatisticsTest100Users0Posts500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 1000 posts, 0 comments")
    void calculateAdvStatisticsTest100Users1000Posts0Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(10, postsPerUser);
        Assertions.assertEquals(0, commentsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 1000 posts, 500 comments")
    void calculateAdvStatisticsTest100Users1000Posts500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(10, postsPerUser);
        Assertions.assertEquals(5, commentsPerUser);
        Assertions.assertEquals(0.5, commentsPerPost);
    }

    @Test
    @DisplayName("100 users, 1000 posts, 1500 comments")
    void calculateAdvStatisticsTest100Users1000Posts1500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf100Users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //When
        Double postsPerUser = statisticsCounter.getPostPerUser();
        Double commentsPerUser = statisticsCounter.getCommentPerUser();
        Double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(10, postsPerUser);
        Assertions.assertEquals(15, commentsPerUser);
        Assertions.assertEquals(1.5, commentsPerPost);
    }
}