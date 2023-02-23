package com.kodilla.testing.minmaxcalc;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Minimum value of list " + Calculator.valuesList +
                " is " + calculator.minValFind(Calculator.valuesList));
        System.out.println("Maximum value of list " + Calculator.valuesList +
                " is " + calculator.maxValFind(Calculator.valuesList));
    }
}
