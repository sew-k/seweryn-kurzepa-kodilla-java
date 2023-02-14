package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalulations() {
        Assertions.assertEquals(6, calculator.add(3,3));
        Assertions.assertEquals(6, calculator.sub(9,3));
        Assertions.assertEquals(6, calculator.mul(2,3));
        Assertions.assertEquals(6, calculator.div(18,3));
    }
}
