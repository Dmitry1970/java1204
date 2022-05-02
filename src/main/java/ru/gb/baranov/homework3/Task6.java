package ru.gb.baranov.homework3;


public class Task6 {

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 6, 10, 17, 8, 24};
        System.out.println(getMin(arr) + " - минимальное значение");
        System.out.println(getMax(arr) + " - максимальное значение");
    }

    public static int getMin(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a > arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    public static int getMax(int[] arr) {
        int b = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (b < arr[i]) {
                b = arr[i];
            }
        }
        return b;
    }
}