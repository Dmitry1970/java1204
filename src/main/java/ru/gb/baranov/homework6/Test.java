package ru.gb.baranov.homework6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 150, 4);
        Dog dog = new Dog("Бобик", 400, 5);
        cat.move();
        cat.swim();
        System.out.println(" ");
        System.out.println("______________");
        System.out.println(" ");
        dog.move();
        dog.swim();
        System.out.println(" ");
        System.out.println("______________");
        System.out.println("всех собак " + Dog.countDog);
        System.out.println("______________");
        System.out.println("всех кошек " + Cat.countCat);
        System.out.println("______________");
        System.out.println("всех животных " + Animal.countAnimal);

    }

}
