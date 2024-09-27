package org.example;

public class ButtonClick {
    public static class Button {
        private int clickCount = 0;

        public void click() {
            ++clickCount;
            System.out.println("count click: " + clickCount);
        }

        public int getClickCount() {
            return clickCount;
        }
    }
}