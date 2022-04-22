package ru.gb.baranov.homework2;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(checkRangeOfSum(18, 3));
    }

    public static boolean checkRangeOfSum(int a, int b) {
        int s = a + b;
        return s >= 10 && s <= 20;
    }
}
