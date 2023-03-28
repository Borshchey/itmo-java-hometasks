package ru.itmo.homeworks.hw2;

public class Task1 {

    // Задача на тернарный оператор
    //Даны два целых числа. Выведите в консоль наибольшее из них. Если числа равны, выведите в консоль любое.

    public static void main(String[] args) {
        int firstNumber = 5, secondNumber = 3;
        System.out.println((firstNumber > secondNumber) ? firstNumber : secondNumber );
    }
}
