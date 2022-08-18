package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ao) {
            System.out.println("The divider can't equals 0. Chose different divider " + "(\"" + ao + "\").");
        } finally {
            System.out.println("The result of the division is:");
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);

        System.out.println(result);
    }
}
