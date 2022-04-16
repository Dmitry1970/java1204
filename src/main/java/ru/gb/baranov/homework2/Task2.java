package ru.gb.baranov.homework2;

public class Task2 {

    public static void main(String[] args) {
        int a = -5;
        PositiveOrNegative(a);
    }

    public static void PositiveOrNegative(int value) {
        if (value >= 0) {
            System.out.println("Число " + value + " положительное");
        } else {
            System.out.println("Число " + value + " отрицательное");
        }
    }
}

