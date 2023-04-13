package ru.itmo.homeworks.hw13;

import ru.itmo.lessons.lesson13.properties.User;

public class Task01 {
    public static void main(String[] args) {

        // Создать экземпляр `PairContainer`, где key - любые числа, value - строка
        PairContainer <Number, String>  first = new PairContainer<>();

        // Создать экземпляр `PairContainer`, где key - строка, value - тип User, у которого id - любые числа
        PairContainer<String, User<Number>> second = new PairContainer<>();

        // Создать экземпляр `PairContainer`, где key - строка, value - тип PairContainer, у которого key - любые числа,
        //   value - тип User, у которого id - строка
        PairContainer<String, PairContainer <Number, User<String>>> third = new PairContainer<>();

    }
}
