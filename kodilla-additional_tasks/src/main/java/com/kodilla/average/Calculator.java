package com.kodilla.average;

import com.kodilla.average.exceptions.EmptyListOfValuesException;
import com.kodilla.average.exceptions.NotMatchSizeOfListsException;
import com.kodilla.average.exceptions.ValueOutOfRangeException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public double calculateWeightedAverage(List<Integer> ratings, List<Integer> weights) throws Exception {
        double result = 0;
        if (ratings.isEmpty() || weights.isEmpty()) {
            throw new EmptyListOfValuesException("Empty list on input\n");
        } else if (ratings.size() != weights.size()) {
            throw new NotMatchSizeOfListsException("Lists 'ratings' and 'weights' don't match by size\n");
        } else if (ratings.stream().anyMatch(r -> (r < 1 || r > 6))) {
            throw new ValueOutOfRangeException("Input value in list of ratings - out of correct range\n");
        } else if (weights.stream().anyMatch(w -> (w < 1 || w > 10))) {
            throw new ValueOutOfRangeException("Input value in list of weights - out of correct range\n");
        } else {
            for (int i = 0; i < ratings.size() ; i++) {
                result = result + (ratings.get(i) * weights.get(i));
            }
            result = result / (weights.stream().mapToInt(Integer::intValue).sum());

            return result;
        }
    }
}
