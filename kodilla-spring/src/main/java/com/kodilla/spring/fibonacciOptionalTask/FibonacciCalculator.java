package com.kodilla.spring.fibonacciOptionalTask;


public class FibonacciCalculator {

    public int calculateFibonacci(int n) throws Exception {
        int result = 0;
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n > 2) {
            int i = 0;
            int j = 1;
            for (int r = 3; r <= n; r++) {
                result = i + j;
                i = j;
                j = result;
            }

            return result;
        } else {
            throw new Exception(" negative value or zero ");
        }
    }

}
