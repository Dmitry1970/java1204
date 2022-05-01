package ru.gb.baranov;

public class Task1 {

    public static void main(String[] args) {

        Employee e = new Employee("Дмитрий", "Кузнецов", "менеджер", "c@c.com", "79991234567", 50000, 35);


        System.out.println("e.firstName = " + e.getFirstName());
        System.out.println("e.lastName = " + e.getLastName());
        System.out.println("e.post = " + e.getPost());
        System.out.println("e.email = " + e.getEmail());
        System.out.println("e.phoneNumber = " + e.getPhoneNumber());
        System.out.println("e.salary = " + e.getSalary());
        System.out.println("e.age = " + e.getAge());

    }

}

