package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static OptionalDouble getAverage(int[] numbers){
        String printNumbers = IntStream.range(0, numbers.length).toString();
        System.out.println(printNumbers);

        OptionalDouble average = IntStream.rangeClosed(0, (numbers.length + 1)).average();

        return average;
    }
}
