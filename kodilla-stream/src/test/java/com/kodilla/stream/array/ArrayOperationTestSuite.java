package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        //When
        double average = ArrayOperations.getAverage(numbers);
        double expectedAverage = (double)(1+2+3+4+5+6+7+8+9+10) / 10;

        //Then
        assertEquals(expectedAverage, average);
    }
}
