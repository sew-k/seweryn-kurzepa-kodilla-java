package com.kodilla.testing.forum.tdd;
import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.ForumPost;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatsCalculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.when;

@DisplayName("TDD: Stats Calculator Test Suite")
@ExtendWith(MockitoExtension.class)
public class StatsCalculatorTestSuite {
    private static int testCounter = 0;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String user = "FirstName" + n + " " + "LastName" + n;
            resultList.add(user);
        }
        return resultList;
    }
    private static List<String> list0Users= new ArrayList<>();


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {

        System.out.println("All tests are finished.");
        System.out.println("-----------------------------------------------------------------");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Statistics statisticsMock;

    @Nested
    class testAverageUserPostsQuantityCalc {
        @Test
        void testAverageUserPostsQuantityCalc0Posts0Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 0;
            int usersQuantity = 0;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserPostsQuantity = statsCalculator.averageUserPostsQuantityCalc();
            double expected = (double)postsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserPostsQuantity);
        }
        @Test
        void testAverageUserPostsQuantityCalc0Posts100Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 0;
            int usersQuantity = 100;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserPostsQuantity = statsCalculator.averageUserPostsQuantityCalc();
            double expected = (double)postsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserPostsQuantity);
        }
        @Test
        void testAverageUserPostsQuantityCalc1000Posts100Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 1000;
            int usersQuantity = 100;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserPostsQuantity = statsCalculator.averageUserPostsQuantityCalc();
            double expected = (double)postsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserPostsQuantity);
        }
        @Test
        void testAverageUserPostsQuantityCalc1000Posts0Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 1000;
            int usersQuantity = 0;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserPostsQuantity = statsCalculator.averageUserPostsQuantityCalc();
            double expected = (double)postsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserPostsQuantity);
        }
    }

    @Nested
    class testAverageUserCommentsQuantityCalc {
        @Test
        void testAverageUserCommentsQuantityCalc0Comments0Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int commentsQuantity = 0;
            int usersQuantity = 0;
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserCommentsQuantity = statsCalculator.averageUserCommentsQuantityCalc();
            double expected = (double)commentsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserCommentsQuantity);
        }
        @Test
        void testAverageUserCommentsQuantityCalc0Comments100Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int commentsQuantity = 0;
            int usersQuantity = 100;
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserCommentsQuantity = statsCalculator.averageUserCommentsQuantityCalc();
            double expected = (double)commentsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserCommentsQuantity);
        }
        @Test
        void testAverageUserCommentsQuantityCalc1000Comments0Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int commentsQuantity = 1000;
            int usersQuantity = 0;
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserCommentsQuantity = statsCalculator.averageUserCommentsQuantityCalc();
            double expected = (double)commentsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserCommentsQuantity);
        }
        @Test
        void testAverageUserCommentsQuantityCalc1000Comments100Users() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int commentsQuantity = 1000;
            int usersQuantity = 100;
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(usersQuantity));

            //When
            double averageUserCommentsQuantity = statsCalculator.averageUserCommentsQuantityCalc();
            double expected = (double)commentsQuantity / usersQuantity;

            //Then
            Assertions.assertEquals(expected, averageUserCommentsQuantity);
        }
    }

    @Nested
    class testAverageCommentsOnPostQuantityCalc {
        @Test
        void testAverageCommentsOnPostQuantityCalc0Comments1000Posts() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 1000;
            int commentsQuantity = 0;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

            //When
            double averageCommentsOnPosts = statsCalculator.averageCommentsOnPostQuantityCalc();
            double expected = (double)commentsQuantity / postsQuantity;

            //Then
            Assertions.assertEquals(expected, averageCommentsOnPosts);
        }
        @Test
        void testAverageCommentsOnPostQuantityCalc1000Comments0Posts() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 0;
            int commentsQuantity = 1000;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

            //When
            double averageCommentsOnPosts = statsCalculator.averageCommentsOnPostQuantityCalc();
            double expected = (double)commentsQuantity / postsQuantity;

            //Then
            Assertions.assertEquals(expected, averageCommentsOnPosts);
        }
        @Test
        void testAverageCommentsOnPostQuantityCalcMoreCommentsThanPosts() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 100;
            int commentsQuantity = 10000;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

            //When
            double averageCommentsOnPosts = statsCalculator.averageCommentsOnPostQuantityCalc();
            double expected = (double)commentsQuantity / postsQuantity;

            //Then
            Assertions.assertEquals(expected, averageCommentsOnPosts);
        }
        @Test
        void testAverageCommentsOnPostQuantityCalcLessCommentsThanPosts() {
            //Given
            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
            int postsQuantity = 10000;
            int commentsQuantity = 100;
            when(statisticsMock.postsCount()).thenReturn(postsQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

            //When
            double averageCommentsOnPosts = statsCalculator.averageCommentsOnPostQuantityCalc();
            double expected = (double)commentsQuantity / postsQuantity;

            //Then
            Assertions.assertEquals(expected, averageCommentsOnPosts);
        }
    }

    @Nested
    class testCalculateAdvStatistics {
        @Test
        @DisplayName("Testing complex method calculateAdvStatistics for random values and saving them in class attributes")
        void testCalculateAdvStatisticsRandomValues() {
            //Given
            Random randomGenerator = new Random();
            int randomUsersQuantity = randomGenerator.nextInt(1000);
            int randomCommentsCount = randomGenerator.nextInt(1000);
            int randomPostsCount = randomGenerator.nextInt(1000);

            StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);

            when(statisticsMock.postsCount()).thenReturn(randomPostsCount);
            when(statisticsMock.commentsCount()).thenReturn(randomCommentsCount);
            when(statisticsMock.userNames()).thenReturn(generateListOfNUsers(randomUsersQuantity));

            //When
            statsCalculator.calculateAdvStatistics(statisticsMock);

            double expectedAverageUserPostsQuantity = (double)randomPostsCount / randomUsersQuantity;
            double expectedAverageUserCommentsQuantity = (double)randomCommentsCount / randomUsersQuantity;
            double expectedAverageCommentsOnPostQuantity = (double)randomCommentsCount / randomPostsCount;

            //Then
            Assertions.assertEquals(randomUsersQuantity, statsCalculator.getUsersQuantity());
            Assertions.assertEquals(randomCommentsCount, statsCalculator.getCommentsQuantity());
            Assertions.assertEquals(randomPostsCount, statsCalculator.getPostsQuantity());
            Assertions.assertEquals(expectedAverageUserPostsQuantity, statsCalculator.getAverageUserPostsQuantity());
            Assertions.assertEquals(expectedAverageUserCommentsQuantity, statsCalculator.getAverageUserCommentsQuantity());
            Assertions.assertEquals(expectedAverageCommentsOnPostQuantity, statsCalculator.getAverageCommentsOnPostQuantity());
        }
    }
}
