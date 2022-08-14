package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[] = { 2, 3, 2, 3, 2, 3, 2, 3, 2, 3 };

        //When
        OptionalDouble expectedAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(OptionalDouble.of(2.5), expectedAverage);
    }
}
