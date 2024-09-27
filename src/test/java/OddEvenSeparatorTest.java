package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {

    @Test
    void addNumber() {
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

        assertTrue(oddEvenSeparator.addNumber(5));
        assertTrue(oddEvenSeparator.addNumber(4));

        assertArrayEquals(new Integer[] { 5 }, oddEvenSeparator.odd().toArray(new Integer[1]));
        assertArrayEquals(new Integer[] { 4 }, oddEvenSeparator.even().toArray(new Integer[1]));
    }

    @Test
    void odd() {
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

        oddEvenSeparator.addNumber(1);
        oddEvenSeparator.addNumber(3);
        oddEvenSeparator.addNumber(5);

        assertArrayEquals(new Integer[] { 1, 3, 5 }, oddEvenSeparator.odd().toArray(new Integer[3]));
    }

    @Test
    void even() {
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();

        oddEvenSeparator.addNumber(2);
        oddEvenSeparator.addNumber(4);
        oddEvenSeparator.addNumber(6);

        assertArrayEquals(new Integer[] { 2, 4, 6 }, oddEvenSeparator.even().toArray(new Integer[3]));
    }
}