package ru.gb.baranov.homework2;

public class Task5 {

    public static void main(String[] args) {
        int year = 2020;
        System.out.println(HiYear(year));
    }

    public static boolean HiYear(int a) {
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
}
