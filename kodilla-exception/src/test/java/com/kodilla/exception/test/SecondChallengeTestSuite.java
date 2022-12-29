package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("-------------------------------------------------------");
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
        System.out.println("-------------------------------------------------------");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println(" *** Preparing to execute test #" + testCounter);
    }

    @Test
    @DisplayName("test conditions: X - correct ; Y - incorrect")
    void testProbablyWillThrowExceptionXCorrectYIncorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1, 1.5));
    }

    @Test
    @DisplayName("test conditions: X - incorrect ; Y - incorrect")
    void testProbablyWillThrowExceptionXIncorrectYIncorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2, 1.5));
    }

    @Test
    @DisplayName("test conditions: X - outside boundary(-) ; Y - correct")
    void testProbablyWillThrowExceptionXIncorrect1YCorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertThrows(Exception.class, () -> sc.probablyIWillThrowException(0.999, 1));
    }

    @Test
    @DisplayName("test conditions: X - outside boundary(+) ; Y - correct")
    void testProbablyWillThrowExceptionXIncorrect2YCorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2, 1));
    }

    @Test
    @DisplayName("test conditions: X - inside boundary (+) ; Y - correct")
    void testProbablyWillThrowExceptionXCorrect1YCorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertDoesNotThrow( () -> sc.probablyIWillThrowException(1, 1));
    }

    @Test
    @DisplayName("test conditions: X - inside boundary (-) ; Y - correct")
    void testProbablyWillThrowExceptionXCorrect2YCorrect() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When
        assertDoesNotThrow( () -> sc.probablyIWillThrowException(1.999, 1));
    }
}
