package hw5;

public class Task5 {

//    Задача 4
//    Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
//    Предложение для поска длинного слова: "в предложении все слова разной длины"
//    (самостоятельно найти метод преобразования строки в массив строк).

    public static void main(String[] args) {
        String phrase = "в предложении все слова разной длины";
        String[] array = phrase.split(" ");

        int length = array[0].length();
        String word = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > length) {
                length = array[i].length();
                word = array[i];
            }
        }
        System.out.println(word);
    }
}

