package com.kodilla.collection_filter;

import java.util.*;

public class Filter {
    public List<Integer> segregate(int... integers) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> inputList = new LinkedList<>();

        for (int x : integers) {
            inputList.add(x);
        }

        while (!inputList.isEmpty()) {
            int toAdd = inputList.get(0);
            int toRemoveIndex = 0;
            for (int i = 0; i < inputList.size(); i++) {
                if (i < inputList.size() -1) {
                    if (toAdd > inputList.get(i + 1)) {
                        toAdd = inputList.get(i + 1);
                        toRemoveIndex = i + 1;
                    }
                }
            }
            resultList.add(toAdd);
            inputList.remove(toRemoveIndex);
        }
        return resultList;
    }
}
