package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingCalculator {

    public static void main(String[] args){

        Calculator calculatorTest = new Calculator(5,8);

        int addResult = calculatorTest.add();
        int subtractResult = calculatorTest.subtract();

        if (addResult == 13 && subtractResult == -3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test fail");
        }
    }
}
