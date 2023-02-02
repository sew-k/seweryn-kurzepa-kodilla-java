package com.kodilla.good.patterns.optionalTask;

import java.math.BigInteger;

public class FactorialCalculator {
    public BigInteger calculateFactorial(int n) throws IncorrectInputValueException {
        BigInteger result = BigInteger.valueOf(1);
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        } else {
            throw new IncorrectInputValueException(" negative value or zero ");
        }
    }
}
