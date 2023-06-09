package ru.itmo.homeworks.hw2;

public class Task5 {

    // Самостоятельно разобрать как работает Math.random() и написать код,
    // который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200)
    // и выводить результат в консоль.
    //[10;500] - квадратные скобки означают, что числа включены в диапазон.
    // (25;200) - круглые скобки означают, что числа не включены в диапазон

    //Примеры работы программы:
    //Число 345 не содержится в интервале (25;200)
    //Число 110 содержится в интервале (25;200)

    public static void main(String[] args) {
        double doubleRandom = Math.random()*(500-10) + 10;
        int random = (int) doubleRandom;
        if (random > 25 && random < 200) System.out.println(random +" included");
        else System.out.println(random + " not included");

    }
}
