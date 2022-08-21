package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillTrowException(1.99, 1.4);

        } catch (Exception e) {
            System.out.println("Data out of boundaries" + "(" + e + ")");
        }
    }
}
