package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    @DisplayName("Testing boundaries arguments")
    void probablyIWillTrowExceptionTestOnBoundaries() {

        //Givenn
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillTrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillTrowException(1, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillTrowException(2, 1))
        );
    }

    @Test
    @DisplayName("Testing out of boundaries arguments")
    void probablyIWillTrowExceptionTestOutOfBoundaries() {

        //Givenn
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillTrowException(0.999, 1.499)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillTrowException(2.001, 1.501))
        );
    }

    @Test
    @DisplayName("Testing in between boundaries arguments")
    void probablyIWillTrowExceptionInBetweenBoundaries() {

        //Givenn
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillTrowException(1.001, 1.499)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillTrowException(1.999, 1.501))
        );
    }
}
