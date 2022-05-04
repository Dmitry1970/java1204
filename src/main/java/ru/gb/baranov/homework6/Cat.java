package ru.gb.baranov.homework6;

public class Cat extends Animal {

    public Cat(String name, int length, int swimLength) {
        super(name, length, swimLength);
        this.maxMove = 200;
        this.maxSwim = 0;
        countCat++;
    }

    public static int countCat = 0;
}
