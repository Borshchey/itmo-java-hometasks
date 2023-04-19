package ru.itmo.homeworks.hw14.task01;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    private ArrayList<Fruit> fruits; // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)

    public FruitStorage() {
        fruits = new ArrayList<>(); // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)
    }
    int fruitsNumber;
    public void addFruit(Fruit newFruit) {
        if (newFruit == null) return;
        for (Fruit fruit : fruits) {
            if (fruit == newFruit) return;
            if (fruit.equals(newFruit)) {
                fruit.setCount(fruit.getCount() + newFruit.getCount());
                return;
            }
        }
        fruits.add(newFruit);
        fruitsNumber++;
        // добавление фрукта newFruit в коллекцию fruits
        // newFruit не может быть null
        // newFruit не может быть ссылкой на элемент коллекции
        // Если в коллекции fruits уже есть фрукт с типом и ценой, как у newFruit,
        // увеличивать значение свойства count
        // фрукта из коллекции на значение свойства count объекта newFruit
        // В противном случае просто добавлять newFruit в коллекцию fruits
    }

    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {
        // возвращает количество фруктов типа fruitType
        if (fruits.size() == 0) return 0;
        int count = 0;
        for (var fruit : fruits) {
            if (fruit.getType() == fruitType) {
                count += fruit.getCount();
            }
        }
        return count;
    }

    public int getNumberOfFruits() {
        // возвращает количество всех фруктов (цикл не использовать)
        return fruitsNumber;
    }

    public void increasePrice(int value) {
        // value может быть в диапазоне [10; 30)
        // увеличить цену фруктов на value процентов

        if (value < 10 || value > 30) {
            System.out.println("value может быть в диапазоне [10; 30)" );
            return;
        }
        for (Fruit fruit : fruits) {
            double upperPrice = (fruit.getPrice() * 0.01 * value);
            fruit.setPrice(fruit.getPrice() + upperPrice);
        }
    }

    public double getFruitsPrice() {
        // возвращает общую стоимость фруктов на складе
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum =+ fruit.getPrice();
        }
        return sum;
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной
        // возвращает список, в который войдут фрукты из коллекции fruits с типом fruitType и ценой не выше maxPrice

        if (fruits.size() == 0) return null;
        if (maxPrice < 0) {
            System.out.println("maxPrice должна быть положительной");
            return null;
        }
        List<Fruit> fruitList = new ArrayList<>();
        for (var fruit : fruits) {
            if (fruit.getType() == fruitType && fruit.getPrice() <= maxPrice) {
                fruitList.add(fruit);
            }
        }
        return fruitList;
    }
}