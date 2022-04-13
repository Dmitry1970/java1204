package ru.gb.baranov.homework1;

public class Task3 {
    public static void main (String[] args) {
        checkSumSign();
    }
    public static void checkSumSign () {
        int a = -5;
        int b = 3;
        int c = a + b;
        System.out.println(c);

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

}
