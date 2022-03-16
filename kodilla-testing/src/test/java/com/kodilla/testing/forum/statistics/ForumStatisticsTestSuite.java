package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Mock
    Statistics statisticsMock = mock(Statistics.class);

    private static int counter = 0;

    private int expectedUserCount;
    private int expectedPostCount;
    private int expectedCommentCount;
    private double expectedMeanPostsPerUser;
    private double expectedMeanCommentsPerUser;
    private double expectedMeanCommentsPerPost;

    private List<String> generateUserList(int userCount) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= userCount; i++){
            resultList.add("user");
        }
        return resultList;
    }

    @BeforeEach
    private void Before(){
        System.out.println("Starting test nr " + counter);
        counter ++;
    }

        @Test
        public void testUser0Posts0Comment0() {
            //Given
            expectedUserCount = 0;
            expectedPostCount = 0;
            expectedCommentCount = 0;
            expectedMeanPostsPerUser = 0;
            expectedMeanCommentsPerUser = 0;
            expectedMeanCommentsPerPost = 0;

            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userList = generateUserList(expectedUserCount);

            when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
            when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
            when(statisticsMock.usersNames()).thenReturn(userList);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            int userCount = forumStatistics.getUserCount();
            int postsCount = forumStatistics.getPostsCount();
            int commentCount = forumStatistics.getCommentCount();
            double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
            double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
            double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

            //Then
            assertEquals(expectedUserCount, userCount);
            assertEquals(expectedPostCount, postsCount);
            assertEquals(expectedCommentCount, commentCount);
            assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
            assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
            assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
        }

        @Test
        public void testUser0Posts1000Comment0() {
            //Given
            expectedUserCount = 0;
            expectedPostCount = 1000;
            expectedCommentCount = 0;
            expectedMeanPostsPerUser = 0;
            expectedMeanCommentsPerUser = 0;
            expectedMeanCommentsPerPost = 0;

            ForumStatistics forumStatistics = new ForumStatistics();
            List<String> userList = generateUserList(expectedUserCount);

            when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
            when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
            when(statisticsMock.usersNames()).thenReturn(userList);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            int userCount = forumStatistics.getUserCount();
            int postsCount = forumStatistics.getPostsCount();
            int commentCount = forumStatistics.getCommentCount();
            double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
            double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
            double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

            //Then
            assertEquals(expectedUserCount, userCount);
            assertEquals(expectedPostCount, postsCount);
            assertEquals(expectedCommentCount, commentCount);
            assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
            assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
            assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
        }

    @Test
    public void testUser0Posts0Comment1000() {
        //Given
        expectedUserCount = 0;
        expectedPostCount = 0;
        expectedCommentCount = 1000;
        expectedMeanPostsPerUser = 0;
        expectedMeanCommentsPerUser = 0;
        expectedMeanCommentsPerPost = 0;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }

    @Test
    public void testUser0Posts1000Comment1000() {
        //Given
        expectedUserCount = 0;
        expectedPostCount = 1000;
        expectedCommentCount = 1000;
        expectedMeanPostsPerUser = 0;
        expectedMeanCommentsPerUser = 0;
        expectedMeanCommentsPerPost = 1;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }

    @Test
    public void testUser100Posts0Comment1000() {
        //Given
        expectedUserCount = 100;
        expectedPostCount = 0;
        expectedCommentCount = 1000;
        expectedMeanPostsPerUser = 0;
        expectedMeanCommentsPerUser = 10;
        expectedMeanCommentsPerPost = 0;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }

    @Test
    public void testUser100Posts1000Comment0() {
        //Given
        expectedUserCount = 100;
        expectedPostCount = 1000;
        expectedCommentCount = 0;
        expectedMeanPostsPerUser = 10;
        expectedMeanCommentsPerUser = 0;
        expectedMeanCommentsPerPost = 0;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }

    @Test
    public void testUser100Posts1000Comment500() {
        //Given
        expectedUserCount = 100;
        expectedPostCount = 1000;
        expectedCommentCount = 500;
        expectedMeanPostsPerUser = 10;
        expectedMeanCommentsPerUser = 5;
        expectedMeanCommentsPerPost = 0.5;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }

    @Test
    public void testUser100Posts1000Comment5000() {
        //Given
        expectedUserCount = 100;
        expectedPostCount = 1000;
        expectedCommentCount = 5000;
        expectedMeanPostsPerUser = 10;
        expectedMeanCommentsPerUser = 50;
        expectedMeanCommentsPerPost = 5;

        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userList = generateUserList(expectedUserCount);

        when(statisticsMock.postsCount()).thenReturn(expectedPostCount);
        when(statisticsMock.commentsCount()).thenReturn(expectedCommentCount);
        when(statisticsMock.usersNames()).thenReturn(userList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        int userCount = forumStatistics.getUserCount();
        int postsCount = forumStatistics.getPostsCount();
        int commentCount = forumStatistics.getCommentCount();
        double meanPostsPerUser = forumStatistics.getMeanPostsPerUser();
        double meanCommentsPerUser = forumStatistics.getMeanCommentsPerUser();
        double meanCommentsPerPost = forumStatistics.getMeanCommentsPerPost();

        //Then
        assertEquals(expectedUserCount, userCount);
        assertEquals(expectedPostCount, postsCount);
        assertEquals(expectedCommentCount, commentCount);
        assertEquals(expectedMeanPostsPerUser, meanPostsPerUser);
        assertEquals(expectedMeanCommentsPerUser, meanCommentsPerUser);
        assertEquals(expectedMeanCommentsPerPost, meanCommentsPerPost);
    }
}
