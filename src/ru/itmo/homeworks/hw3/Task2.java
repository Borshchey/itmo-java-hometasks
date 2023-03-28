package ru.itmo.homeworks.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // Задача на WHILE
        //Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int userNumber = in.nextInt();
        int sum = 0;

        while (userNumber > 0 ) {
            int temp = userNumber % 10;
            sum = sum + temp;
            userNumber = (userNumber - temp) /10;
        }
        System.out.println(sum);
    }
}
