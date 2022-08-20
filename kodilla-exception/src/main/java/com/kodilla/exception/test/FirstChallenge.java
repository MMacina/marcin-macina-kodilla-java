package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3,2);
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("The divider can't equals 0. Chose different divider " + "(\"" + ae + "\").");
        } finally {
            System.out.println("Thank you.");
        }
    }
}
