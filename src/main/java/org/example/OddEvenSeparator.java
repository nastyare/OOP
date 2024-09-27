package org.example;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> evenNumbers = new ArrayList<>();
    private List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("even numbers: " + evenNumbers);
    }

    public void odd() {
        System.out.println("odd numbers: " + oddNumbers);
    }
}
