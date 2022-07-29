package com.kodilla.testing.calculator;

public class Calculator {

    public int a;
    public int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    //public static void main(String[] args) {
        //Calculator calculator = new Calculator();
        //int addingResult = calculator.add(2, 3);
        //System.out.println("Adding result is " +  addingResult);
        //int subtractingResult = calculator.subtract(2, 3);
        //System.out.println("Subtracting result is " +  subtractingResult);
    //}
}
