package ru.gb.baranov.homework6;

public class Dog extends Animal {

    public Dog(String name, int length, int swimLength) {
        super(name, length, swimLength);
        this.maxMove = 500;
        this.maxSwim = 10;
        countDog++;
    }

    public static int countDog = 0;

}

