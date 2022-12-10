package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("ForumTestSuite")
public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When created SimpleUser with realName, " +
                    "then getRealName should return correct name"
    )
    @Test
    void testCaseRealname() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Doe");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("John Doe", result);

    }
    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUserName should return correct name"
    )
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Doe");

        //When
        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);

    }
}
