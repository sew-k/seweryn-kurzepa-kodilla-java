package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import org.junit.jupiter.api.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("");
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
        System.out.println("");
    }

    @DisplayName("If input is empty list, " +
            "method should give also empty list and print " +
            "announcement that is unable to calculate")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //emptyList = null;
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> resultList = exterminator.exterminate(emptyList);
        System.out.println("Testing extermination empty list");

        //Then
        Assertions.assertEquals(resultList.size(), 0);
    }

    @DisplayName("If input is list of random integer values, "+
            "the output should be list with only even numbers")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> randomList = new ArrayList<>();
        Random randomGenerator = new Random();
        int rows = randomGenerator.nextInt(1,100);

        for (int i=0; i<rows; i++) {
            randomList.add(randomGenerator.nextInt(1000));
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> resultList = exterminator.exterminate(randomList);
        System.out.println("Testing extermination random list");

        //Then
        boolean testPassed = true;

        for (int number : resultList) {
            if (number % 2 != 0) {
                testPassed = false;
            }
        }
        Assertions.assertEquals(testPassed, true);
    }
}
