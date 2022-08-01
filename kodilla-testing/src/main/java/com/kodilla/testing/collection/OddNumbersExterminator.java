package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (Integer tempNumber : numbers) {
                if (tempNumber % 2 == 0) {
                    evenNumbers.add(tempNumber);
                }
            }
        }
        return evenNumbers;
    }
}