package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2 };

        //When
        OptionalDouble expectedAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(OptionalDouble.of(5.0), expectedAverage);
    }
}
