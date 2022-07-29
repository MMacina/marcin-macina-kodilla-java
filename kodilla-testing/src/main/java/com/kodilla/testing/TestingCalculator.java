package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingCalculator {

    public static void main(String[] args){

        Calculator calculatorTest = new Calculator();

        int addResult = calculatorTest.add(5, 8);
        int subtractResult = calculatorTest.subtract(5, 8);

        if (addResult == 13 && subtractResult == -3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test fail");
        }
    }
}
