package com.kodilla.testing.minmaxcalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static List<Integer> valuesList = new ArrayList<>(Arrays.asList(3,1,5,6,7,9,15,3,4,7,10));

    public int minValFind(List<Integer> valuesList) {
        int result = valuesList.get(0);
        for(Integer val : valuesList) {
            if (result > val) {
                result = val;
            }
        }
        return result;
    }
    public int maxValFind(List<Integer> valuesList) {
        int result = valuesList.get(0);
        for(Integer val : valuesList) {
            if (result < val) {
                result = val;
            }
        }
        return result;
    }

}
