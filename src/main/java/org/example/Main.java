package org.example;

public class Main {
    public static void main(String[] args) {

        ButtonClick.Button button = new ButtonClick.Button();
        button.click();
        button.click();
        button.click();
        System.out.println("click count = " + button.getClickCount());


        System.out.println("OddEvenSeparator:");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.even();  // Выводит: [2, 4]
        separator.odd();   // Выводит: [1, 3, 5]


        System.out.println("\nBell:");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();  


        System.out.println("\nBalance:");
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(5);
        balance.result();  // Выводит: L (перевесила левая)
        balance.addRight(5);
        balance.result();  // Выводит: = (баланс)


        System.out.println("\nTable:");
        Table table = new Table(3, 3);
        table.setValue(0, 0, 10);
        table.setValue(1, 1, 20);
        table.setValue(2, 2, 30);
        System.out.println("Table contents:\n" + table.toString());
        System.out.println("Average: " + table.average());
    }
}
