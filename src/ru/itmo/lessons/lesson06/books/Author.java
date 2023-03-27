package ru.itmo.lessons.lesson06.books;

public class Author {
    // свойства, характеристики, поля, атрибуты
    // public - модификатор доступа
    // модификатор доступа типДанных имяСвойства

    // значение свойств по умолчанию (дефолтное значение)
    // для ссылочных типов - null
    // для целых чисел - 0
    // для чисел с плавающей точкой 0.0
    // для логического типа - false
    public String name;
    public String surname;

    public String getFullName() {
        String fullName = name + " " + surname;
        return fullName; // name + " " + surname
    }

    public void printFullName(){
        // return; прерывает работу метода
        System.out.println(name + " " + surname);
    }

}
