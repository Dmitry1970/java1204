package ru.gb.baranov.homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood (int n) {
        if(food - n >= 0) {
           food -= n;
            System.out.println("Коту достаточно еды");
            return true;
       }
        else if (food == 0) {
            System.out.println("Кот не может поесть - в тарелке нет еды");
        }
        else {
            System.out.println("Кот не может поесть - в тарелке недостаточно еды");
        }
        return false;
    }
    public void addFood (int n) {
        food +=n;
    }

    public void info()  {
        System.out.println("В тарелке еды: " + food);
    }
}
