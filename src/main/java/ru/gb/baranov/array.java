package ru.gb.baranov;

public class array {

    public static void main(String[] args) {

        Employee [] e = new Employee[5];

        e [0] = new Employee ("Вячеслав", "Зайцев", "генеральный директор", "a@ab.mail.ru", "79991234567", 120000, 45);
        e [1] = new Employee ("Иван", "Иванов", "менеджер", "b@mail.ru", "79853456712", 38000, 51);
        e [2] = new Employee ("Дмитрий", "Сидоров", "инженер", "c@yandex.ru", "79034562317", 50000, 36);
        e [3] = new Employee ("Мария", "Васина", "секретарь", "ds@list.ru", "79256789034", 45000, 28);
        e [4] = new Employee ("Кристина", "Мухина", "специалист", "dm@gmail.com", "79258976543", 53000, 41);

        for (int i = 0; i < e.length; i++) {
            if (e[i].getAge() > 40) {
                System.out.println(e[i]);
            }
        }

    }

}
