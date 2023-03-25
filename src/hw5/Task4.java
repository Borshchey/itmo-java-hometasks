package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {


//    Задача 3
//    Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
//    и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
//    В итоге в массиве будут только уникальные слова. Выход из программы по слову exit (слово 'exit' в массив не добавлять)
//    или если массив заполнен. Перед завершением программы, вывести получившийся массив в консоль

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] array = new String[10];
        String input;
        Boolean skip;

        while (true) {
             for (int i = 0; i < array.length; i++) {
                 skip = false;
                 input = in.nextLine();
                 if (input.equals("exit")) break;

                 for (String word : array) {
                     if (word == null) continue;
                     if (word.equals(input)) {
                         skip = true;
                     break;}
                 }
                 if (!skip) array[i] = input;
             }
             break;
        }
        System.out.println(Arrays.toString(array));
    }
}



