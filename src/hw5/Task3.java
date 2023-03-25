package hw5;

import java.util.Arrays;
public class Task3 {

//    Задача 2
//    Создайте массив из чётных чисел [2;20] (использовать Math.random()) и выведите элементы массива в консоль
//    в обратном порядке (20 18 16 ... 4 2)

    public static void main(String[] args) {
        int[] ints01 = new int[10];
        for (int i = 0; i < ints01.length; i++) {
            int temp = (int) (Math.random() * 18) + 2;
            if (temp % 2 == 0) ints01[i] = temp;
        }

        // сортировка пузырьком
        for (int j = 0; j < ints01.length; j++)
            for (int k = 0; k < ints01.length - 1; k++) {
                if (ints01[k] < ints01[k + 1]) {
                    int temp2 = ints01[k];
                    ints01[k] = ints01[k + 1];
                    ints01[k + 1] = temp2;
                }
            }
        System.out.println(Arrays.toString(ints01));
    }
}
