package com.kodilla.average;

import com.kodilla.average.exceptions.EmptyListOfValuesException;
import com.kodilla.average.exceptions.NotMatchSizeOfListsException;
import com.kodilla.average.exceptions.ValueOutOfRangeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTestSuite {

    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Testing: calculate average value with correct input")
    void testCalculateAverageValue() {
        //Given
        List<Integer> ratings = new ArrayList<>(Arrays.asList(
                3,
                1,
                1,
                5,
                6,
                4
        ));
        List<Integer> weights = new ArrayList<>(Arrays.asList(
                4,
                6,
                8,
                4,
                4,
                10
        ));
        double result = 0;
        //When
        try {
            result = calculator.calculateWeightedAverage(ratings, weights);
        } catch (Exception e) {

        }

        //Then
        Assertions.assertEquals(3.056,result, 0.01);
    }
    @Test
    @DisplayName("Testing: calculate average value with input weight out of range")
    void testCalculateAverageValueInputWeightOutOfRange() {
        //Given
        List<Integer> ratings = new ArrayList<>(Arrays.asList(
                3,
                1
        ));
        List<Integer> weights = new ArrayList<>(Arrays.asList(
                4,
                11
        ));
        double result = 0;
        //When
        try {
            result = calculator.calculateWeightedAverage(ratings, weights);
        } catch (Exception e) {
            System.out.printf("Exception: " + e);
        }

        //Then
        Assertions.assertThrows(ValueOutOfRangeException.class,
                () -> calculator.calculateWeightedAverage(ratings, weights),
                "Input value in list of weights - out of correct range");
    }
    @Test
    @DisplayName("Testing: calculate average value with input rating out of range")
    void testCalculateAverageValueInputRatingOutOfRange() {
        //Given
        List<Integer> ratings = new ArrayList<>(Arrays.asList(
                7,
                1
        ));
        List<Integer> weights = new ArrayList<>(Arrays.asList(
                4,
                8
        ));
        double result = 0;
        //When
        try {
            result = calculator.calculateWeightedAverage(ratings, weights);
        } catch (Exception e) {
            System.out.printf("Exception: " + e);
        }

        //Then
        Assertions.assertThrows(ValueOutOfRangeException.class,
                () -> calculator.calculateWeightedAverage(ratings, weights),
                "Input value in list of ratings - out of correct range");
    }
    @Test
    @DisplayName("Testing: calculate average value with input lists not match by size")
    void testCalculateAverageValueInputListsNotMatchEachOther() {
        //Given
        List<Integer> ratings = new ArrayList<>(Arrays.asList(
                6,
                1,
                5
        ));
        List<Integer> weights = new ArrayList<>(Arrays.asList(
                4,
                8
        ));
        double result = 0;
        //When
        try {
            result = calculator.calculateWeightedAverage(ratings, weights);
        } catch (Exception e) {
            System.out.printf("Exception: " + e);
        }

        //Then
        Assertions.assertThrows(NotMatchSizeOfListsException.class,
                () -> calculator.calculateWeightedAverage(ratings, weights),
                "Lists 'ratings' and 'weights' don't match by size");
    }
    @Test
    @DisplayName("Testing: calculate average value with one empty input list")
    void testCalculateAverageValueOneOfListsIsEmpty() {
        //Given
        List<Integer> ratings = new ArrayList<>(Arrays.asList(
                6,
                1,
                5
        ));
        List<Integer> weights = new ArrayList<>();
        double result = 0;
        //When
        try {
            result = calculator.calculateWeightedAverage(ratings, weights);
        } catch (Exception e) {
            System.out.printf("Exception: " + e);
        }

        //Then
        Assertions.assertThrows(EmptyListOfValuesException.class,
                () -> calculator.calculateWeightedAverage(ratings, weights),
                "Empty list on input");
    }
}
