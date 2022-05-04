package ru.gb.baranov.homework6;

public class Animal {
    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;

    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
       this.swim = swim;
    }

//    public void dog.setSwim (int swim) {
//        if(swim >= 0 &&  < 250){
//            this.age = age;
//        }
     public void animalInfo() {
        System.out.println(name + " пробежал " + run + " метров");
        System.out.println(name + " проплыл " + swim + " метров");
    }

}

