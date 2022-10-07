package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAddAtoB() {
        calculator.add(4,15);
    }

    @Test
    public void testSubAfromB() {
        calculator.sub(4,15);
    }

    @Test
    public void testMulAbyB() {
        calculator.mul(4,15);
    }

    @Test
    public void testDevAbyB() {
        calculator.dev(4,15);
    }
}
