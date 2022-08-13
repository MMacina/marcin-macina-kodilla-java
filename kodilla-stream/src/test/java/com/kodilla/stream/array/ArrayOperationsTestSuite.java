package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        //When
        OptionalDouble expectedAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(OptionalDouble.of(5.0), expectedAverage);
    }
}
