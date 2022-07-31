package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (int i=0; i < numbers.size(); i++) {
                Integer tempNumber = numbers.get(i);
                if (tempNumber % 2 != 0) {
                    numbers.remove(tempNumber);
                }
            }
        }
        return numbers;
    }
}