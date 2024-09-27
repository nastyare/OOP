package org.example;

public class Bell {
    private boolean isDing;

    public Bell() {
        this.isDing = true;  // Начинаем с "ding"
    }

    public void sound() {
        if (isDing) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        isDing = !isDing;  // Меняем флаг на противоположный
    }
}
