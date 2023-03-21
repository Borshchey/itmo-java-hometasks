package hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // Задача на использование любого цикла (выберите сами)
        //Программа загадывает число в диапазоне [1;9]
        //Пользователь вводит число с клавиатуры
        //Программа в зависимости от введенного числа выводит в консоль следующее:
        //"загаданное число больше"
        //"загаданное число меньше"
        //"Вы угадали" (программа завершает работу)
        //Если введен 0, выввести "выход из программы" (программа завершает работу)

        double computerNumber = (int) Math.random()*(9-1) + 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от [1;9]");
        int userNumber = in.nextInt();

        //if (userNumber == 0) { System.exit(0); }

        while (userNumber != computerNumber) {

            if (userNumber == 0) {
                System.out.println("выход из программы");
                break;
            } else if (userNumber > computerNumber) {
                System.out.println("загаданное число меньше");
                System.out.println("Введите число в диапазоне от [1;9]");
                userNumber = in.nextInt();

            } else {
                System.out.println("загаданное число больше");
                System.out.println("Введите число в диапазоне от [1;9]");
                userNumber = in.nextInt();

            }
        }
            System.out.println("Вы угадали");
        }
    }

