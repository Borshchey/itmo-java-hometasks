package hw5;

import java.util.Arrays;

public class Task6 {

//    Задача 5
//    Создать массив, наполнить его целыми числами (отрицательными и положительными).
//    Отрицательные элементы массива скопировать в новый массив.
//    Размер массива должен быть равен количеству отрицательных элементов.

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) count++;
        }
        int[] newArray = new int[count];
        int j = 0;
        for (int number : array) {
            if (number < 0) {
                newArray[j] = number;
                j++;
            }
        }

//        for (int j = 0; j < count; j++) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < 0) {
//                    newArray[j] = array[i];
//                    array[i] = 0;
//                    break;}
//            }
//        }
            System.out.println(Arrays.toString(newArray));
        }
    }

