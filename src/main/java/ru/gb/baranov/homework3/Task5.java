package ru.gb.baranov.homework3;

public class Task5 {

    public static void main(String[] args) {
        arr(5, 10);

    }

    public static int[] arr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

}
