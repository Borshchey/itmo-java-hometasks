package hw1;

public class Task3 {
    public static void main(String[] args) {
        // Даны две переменные типа double: время (в часах) и расстояние (в километрах).
        // Найти и вывести в консоль скорость, выраженную в метрах в секунду.

        double time = 2, length = 15;
        System.out.println((length*1000)/(time*3600));
    }
}
