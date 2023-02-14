package com.kodilla.spring.fibonacciOptionalTask;

public class Application {
    public static void main(String[] args) {
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        try {
            System.out.println(fibonacciCalculator.calculateFibonacci(10));
        } catch (Exception e) {
            System.out.println("Error - incorrect input value: " + e);
        } finally {
            System.out.println("End of program");
        }
    }
}
