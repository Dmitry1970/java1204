package ru.gb.baranov.homework2;

public class Task4 {
    public static void main(String[] args) {
        printTextNTimes("строка", 5);
    }

    public static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
//        while (n > 0) {
//            System.out.println(text);
//            n--;
//        }


