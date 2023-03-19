package hw2;

public class Task2 {

    // Задача на тернарный оператор
    //Дано целое число. Если оно чётное, выведите в консоль 0, если нет, то выведите в консоль -1;

    public static void main(String[] args) {
        int number = 2;
        System.out.println((number % 2 == 0) ? "0" : "-1");
    }
}
