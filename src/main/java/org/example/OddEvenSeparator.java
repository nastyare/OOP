package org.example;

import java.util.ArrayList;

public class OddEvenSeparator {
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public boolean addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }

        return true;
    }

    public ArrayList<Integer> odd() {
        return oddNumbers;
    }

    public ArrayList<Integer> even() {
        return evenNumbers;
    }
}
