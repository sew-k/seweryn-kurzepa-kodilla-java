package com.kodilla.exception.test;

import java.io.*;

public class FirstChallenge {

    //additional task

    public int exponentiation(int a, int b) {
        int result = 0;
        if (a > 0) {
            result = 1;
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
        }
        if (b == 0) result = 1;
        return result;
    }

    public double divide(double a, double b) throws ArithmeticException {
        double result = 0;
        try {
            System.out.println("Trying to calculate");
            result = a / b;
            if (b == 0) result = (int) a / (int) b;
            return result;

        } catch (ArithmeticException e) {
            System.out.println("Exception in calculations: " + e);
        } finally {
            System.out.print("End of program. The result is: ");
            return result;
        }
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);

        System.out.println(result);

    }
}
