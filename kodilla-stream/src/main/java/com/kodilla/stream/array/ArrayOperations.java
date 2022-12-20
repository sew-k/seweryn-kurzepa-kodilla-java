package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        Integer[] numbersInt = new Integer[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            numbersInt[i] = (Integer) numbers[i];
        }
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersInt));

        IntStream.range(0, numbersList.size())
                .map(n -> numbersList.get(n))
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, numbersList.size())
                .mapToDouble(n -> numbersList.get(n))
                .average();

        return result.getAsDouble();
    }
}