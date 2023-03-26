package hw5;

import java.util.Scanner;

public class Task2 {



//    Задача 1
//    Заполните массив на N элементов (размер массива вводит пользователь) случайным целыми числами и выведете максимальное,
//    минимальное и среднее арифметическое значение элементов массива

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] >= max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }

        int mid = sum/array.length;
        System.out.println(max + " " + min + " " + mid);
    }
}
