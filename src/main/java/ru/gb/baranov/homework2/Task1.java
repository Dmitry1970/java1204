package ru.gb.baranov.homework2;

public class Task1 {

    public static void main(String[] args) {
        int a = 9, b = 5;
        int s = a + b;
        System.out.println(amount(s));
    }

    public static boolean amount(int summ) {
        return summ >= 10 && summ <= 20;
    }
}
