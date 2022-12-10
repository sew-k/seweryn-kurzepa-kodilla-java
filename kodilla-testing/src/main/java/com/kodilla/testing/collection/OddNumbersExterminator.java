package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<>();

        if (numbers.size() > 0) {
            for (Integer number : numbers) {
                System.out.print("Calculating extermination of number " + number);
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                    System.out.println(" - added " + number + " to the list");
                } else {
                    System.out.println(" - an odd number. Terminate.");
                }
            }
            return evenNumbers;
        } else {
            System.out.println("The list is empty! Unable to calculate!");
            return evenNumbers;
        }
    }
}
