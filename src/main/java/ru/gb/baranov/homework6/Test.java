package ru.gb.baranov.homework6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 200, 100 );
        Dog dog = new Dog("Бобик", 500, 100);
        cat.setSwim(0);
        dog.animalInfo();
        cat.animalInfo();




    }



}
