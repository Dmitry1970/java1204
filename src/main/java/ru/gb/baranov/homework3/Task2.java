package ru.gb.baranov.homework3;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        System.out.print(Arrays.toString(arr));
    }

}
