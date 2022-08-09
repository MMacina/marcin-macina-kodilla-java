package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
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

    StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

    //List<String> listOf100Users = new ArrayList<>();
    //for (int n = 1; n <= 100; n++) {
    //    listOf100Users.add("Name" + n)
    //}

    List<String> listOf0Users = new ArrayList<>();

    int post0 = 0;
    int post1000 = 1000;

    int comment0 = 0;
    int commentsLessThen0Posts = -500;
    int commentsMoreThen0Posts = 500;
    int commentsLessThen1000Posts = 500;
    int commentsMoreThen1000Posts = 1500;

    @Test
    void calculateAdvStatisticsTest0Users1000Posts1500Comments () {
        //Given
        when(statisticsMock.usersNames()).thenReturn(listOf0Users);
        when(statisticsMock.postsCount()).thenReturn(post1000);
        when(statisticsMock.commentsCount()).thenReturn(commentsMoreThen1000Posts);

        //When
        double postsPerUser = statisticsCounter.getPostPerUser();
        double commentsPerUser = statisticsCounter.getCommentPerUser();
        double commentsPerPost = statisticsCounter.getCommentPerPost();

        //Then
        Assertions.assertEquals(0, postsPerUser);
        Assertions.assertEquals(0, commentsPerPost);
        Assertions.assertEquals(0, commentsPerUser);
    }
}