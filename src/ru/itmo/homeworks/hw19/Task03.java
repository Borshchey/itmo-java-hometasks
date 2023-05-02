package ru.itmo.homeworks.hw19;




import ru.itmo.homeworks.hw14.task01.Fruit;

import java.util.Optional;

public class Task03 {

    // Задания на методы Optional:
    // 1. написать метод, который принимает на вход тип фрукта, стоимость и количество
    // и возвращает Optional контейнер с экземпляром типа Fruit
    // или Optional контейнер с null ссылкой, если тип фрукта == null, а стоимость или количество меньше 1

    public static Optional<Fruit> task01(Fruit fruit, Fruit.FruitType type, double price, int count) {
        return Optional.ofNullable(fruit)
                .filter(f -> type == null)
                .filter(f -> price < 0)
                .filter(f -> count < 0);
    }

    // 2. написать метод, который принимает на вход экземпляр типа Fruit
    // и возвращает true, если передан не null, количество фруктов (getCount) больше 5,
    // а стоимость не больше 100 (getPrice)
    // Вместо обычных проверок использовать тип Optional и подходящие методы
    public static boolean isFruitValid(Fruit fruit) {
        return Optional.ofNullable(fruit)
                .filter(f -> f.getCount() >  5)
                .filter(f -> f.getPrice() <= 100)
                .isPresent();
    }

    // 3. написать метод, который принимает на вход экземпляр типа Fruit
    // и возвращает
    // название фрукта (FruitType.getName()) в Optional контейнере, если тип фрукта определен,
    // и Optional контейнер с null ссылкой, если тип фрукта == null
    // Вместо обычных проверок использовать тип Optional и подходящие методы

    public static Optional<String> task03(Fruit fruit) {
       return  Optional.ofNullable(fruit)
                .filter(f -> f.getType() == null)
                 .get(fruit.getName());
    }

    public static void main(String[] args) {

        // 3. написать метод, который принимает на вход экземпляр типа Fruit
        // и возвращает
        // название фрукта (FruitType.getName()) в Optional контейнере, если тип фрукта определен,
        // и Optional контейнер с null ссылкой, если тип фрукта == null
        // Вместо обычных проверок использовать тип Optional и подходящие методы
    }


}

