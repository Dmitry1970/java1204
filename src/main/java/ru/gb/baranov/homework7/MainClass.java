package ru.gb.baranov.homework7;

public class MainClass {

    public static void main(String[] args) {
        Cat[] catArray = new Cat[(int) (1 + Math.random() * 6)];
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat("cat " + (i + 1), (int) (1 + Math.random() * 26));
        }

        Plate plate = new Plate(30);
        plate.addFood(30);
        plate.info();
        for (Cat cat : catArray) {
            cat.info();
            cat.eat(plate);
            cat.info();
            plate.info();
        }

    }
}









