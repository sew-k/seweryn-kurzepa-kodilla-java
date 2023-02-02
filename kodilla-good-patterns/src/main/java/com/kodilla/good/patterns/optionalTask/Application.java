package com.kodilla.good.patterns.optionalTask;

public class Application {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        try {
            System.out.println(factorialCalculator.calculateFactorial(10));
        } catch (IncorrectInputValueException e) {
            System.out.println("Error - incorrect input value: " + e);
        } finally {
            System.out.println("End of program");
        }
    }
}
