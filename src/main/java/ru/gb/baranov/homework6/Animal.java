package ru.gb.baranov.homework6;

public class Animal {

    private String name;
    private int length;
    private int swimLength;
    int maxMove;
    int maxSwim;


    public Animal(String name, int length, int swimLength) {
        this.name = name;
        this.length = length;
        this.swimLength = swimLength;
        this.maxMove = 0;
        this.maxSwim = 0;
        countAnimal++;

    }

    public static int countAnimal = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void move() {
        if (maxMove <= 0) {
            System.out.println(name + " не умеет бегать");
        } else if (maxMove >= length) {
            System.out.println(name + " пробежал " + length + " метров");
        } else {
            System.out.println("для " + name + " дистанция слишком большая");
        }
    }

    void swim() {
        if (maxSwim <= 0) {
            System.out.println(name + " не умеет плавать");
        } else if (maxSwim >= swimLength) {
            System.out.println(name + " проплыл " + swimLength + " метров");
        } else {
            System.out.println("для " + name + " дистанция слишком большая");
        }
    }

}

