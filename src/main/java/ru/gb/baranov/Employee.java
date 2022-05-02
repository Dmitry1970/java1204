package ru.gb.baranov;

public class Employee {
     private String firstName;
     private String lastName;
     private String post;
     private String email;
     private String phoneNumber;
     private int salary;
     private int age;



     public Employee(String firstName, String lastName, String post, String email, String phoneNumber,int salary, int age) {
     this.firstName= firstName;
     this.lastName= lastName;
     this.post = post;
     this.email = email;
     this.phoneNumber = phoneNumber;
     this.salary = salary;
     this.age = age;
     setAge(age);
    }
    public void print() {
        System.out.println("Ф.И.О - " + firstName + " " + lastName + "\n" + "Должность: " + post + "\n"+ "Почта : " + email + "\n" + "Номер телефона: " + phoneNumber +
                "\n" + "Зарплата: " + salary + "\n" + "Возраст " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age < 250) {
            this.age = age;
        }
    }

}





