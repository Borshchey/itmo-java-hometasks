package ru.itmo.homeworks.hw14.task03;

import ru.itmo.homeworks.hw14.task02.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить необходимые конструкторы, геттеры, сеттеры и другие методы


    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

// TODO: дописать реализацию метода для создания списка объектов класса Employee.
    //  Объекты Employee создавать со случайными значениями:
    //  возраст от 21 до 60;
    //  диапазон ЗП на Ваш выбор.
    //  name - случайное значения из массива names
    //  company - случайное значения из массива companies

    public static List<Employee> employeeGenerator(int num) { //  num - количество объектов в списке
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        if (num <= 0) {
            return Collections.emptyList();
        }
        // создание объектов, наполнение списка
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[(int)(Math.random() * names.length)],
                    companies[(int)(Math.random() * companies.length)],
                    (int )(Math.random() * 15000) + 60000,
                   (int )(Math.random() * 60) + 21));
        }
        return employees;
    }

}