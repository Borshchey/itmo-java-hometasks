package lesson05;

import java.util.Arrays;

public class Lesson05 {

    public static void main(String[] args) {

        // массивы

        int[] codes = {544, 321, 123, 567, 876};
        //   System.out.println(codes[10]); // выход за пределы массива - ошибка, остановка программы

        System.out.println(codes[2]); // 123

        // длина массива всегда положительная и опеределяяется типом int
        // длина массива неизменна

        System.out.println(codes.length);

        System.out.println(codes[codes.length - 1]);

        // вывести в консоль случайный элемент

        int index = (int) Math.random() * (codes.length);
        System.out.println(codes[index]);
        System.out.println("-----------------------------------------------");

        // перебор массива в цикле
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
            if (codes[i] < 1000) codes[i] += 1000;

            //iter
            // последовательный перевод элементов массива от 1 к последнему
            // не позволяет изменять значения элементов
            for (int code : codes) {  // codes  - перебираемый массив
                System.out.println(code); // int code -> int - тип элементов массива, code  - значение элемента массива
            }

            // массив со значениями по умолчанию
//            int[] ints01 = new int[10]; // int[10] - длина массива
//            String[] colors = new String[4];

            // [имяПеременной] [выражения] могут быть длиной массива

            // массив типа byte/int/short/long - наполняется 0
            // массив типа float/double - наполняется 0.0
            // массив типа boolean - наполняется false
            // массив ссылочного типа -наполняется null
            System.out.println("-----------------------------------------------");

            // заменить дефолтные значения массива ints01 случайными числами в диапазоне [0,30)
            // для замены использовать цикл
            int[] ints01 = new int[10];
            for (i = 0; i < ints01.length; i++) {
                ints01[i] = (int) (Math.random() * 30);
                System.out.println(ints01[i]);
            }

            // заменить дефолтные значения массива colors любыми цветами
            // вывести информацию о том есть ли красый цвет
            String[] colors = new String[4];
            colors[0] = "red";
            colors[1] = "black";

            for (String color : colors) {
                if (color == null) continue;
                if (color.equals("red"))
                    System.out.println("RED!");
                break;
            }

            // Arrays
            System.out.println(Arrays.toString(colors));



            // методы для работы с массивами
            double[] temps = {45.7, 22.9, 12.0, 33.8, 98.1};
            // СОРТИРОВКА
            Arrays.sort(temps); // метод сорт меняет массив
            System.out.println(Arrays.toString(temps));

            // БИНАРНЫЙ ПОИСК
            System.out.println(Arrays.binarySearch(temps, 98.1)); // возвращает индекс искомого в массива элемента
            System.out.println(Arrays.binarySearch(temps, 100)); // при отсутствии  элемента возвращается -индексЧисла

            // СОЗДАНИЕ КОПИЙ
            // 1) Позволяет сделать полную копию массива
            double[] newTemps01 = temps.clone();
            System.out.println(Arrays.toString(newTemps01));

            // 2) Позволяет скопировать несколько первых элементов массива или сделать полную копию массива
            double[] newTemps02 = Arrays.copyOf(temps, 3);  // 3 первые элемента из родительского массива
            System.out.println(Arrays.toString(newTemps02));

            // 3) System.arraycopy(Object src, int srcPos, Object dst, int dstPos, int len)
            // Метод копирует len элементов массива src, начиная с позиции srcPos,
            // в массив dst, начиная с позиции dstPos.
            // Массив dst должен иметь достаточный размер, чтобы в нем поместились все копируемые элементы.
            double[] newTemps03 = new double[30];
            System.arraycopy(temps, 0, newTemps03, 10, temps.length);
            System.out.println(Arrays.toString(newTemps03));
        }
    }
}

