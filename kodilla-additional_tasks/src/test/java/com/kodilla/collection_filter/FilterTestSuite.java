package com.kodilla.collection_filter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterTestSuite {
    @Test
    void testSegregate() {
        //Given
        Filter filter = new Filter();

        //When
        List<Integer> resultList = filter.segregate(2,1,3,4,6);
        System.out.println(resultList);

        //Then
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,2,3,4,6)), resultList);
    }
}
