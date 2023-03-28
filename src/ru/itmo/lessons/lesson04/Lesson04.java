package ru.itmo.lessons.lesson04;

public class Lesson04 {

    public static void main(String[] args) {


        // char (примитивный тип данных) 16 бит - символ юникода
        char char01 = 'J'; // в одинарных кавычках
        // "J" - строка, ссылочный тип String
        char char02 = 74; // по таблице юникода в диапазон от 0 до 65535

        char char03 = '\u0044'; // 16ричное представление в escape представлении

        System.out.println(char01);
        System.out.print(char02);
        System.out.print(char03);

        System.out.println("\uD83D\uDC38"); //суррогатная пара char

        //строка - упорядоченный последовательность символов в двойных кавычках "qwerty"
        // строка - ссылочный тип        - что такое? !!!!
        // строка - экземпляр класса String

        //  Создание строк:
        // 1. можно создать строку в двойных кавычек
        // 2. через конструктор new String() - используется только если первый вариант невозможен
        // строку нельзя изменить, можно создать новую на основе предыдущей
        // хранение строк до java9: массив char в кодировке utf-16, где каждый char - 2 byte
        // после - массив byte



        String string01 = "строка";
        String string02 = "строка";
        String string03 = new String("строка");

        //ссылочные типы хранятся в хип памяти (куче)
        // в хип памяти находится пулл строк


        // ссылочные типы не сравнивают через ==
        // так как оператор равнения сранвивает объекты, га которые ведут ссылки, а не значения

        string02 = null; // ссылка никуда не ведет
        System.out.println(string02 == null); //сравнивать с null можно

        // интернирование строк
        //  - строка помещается в пул строк
        String internString = string03.intern();
        string03 = null; // удалит ссылку на кучу


         string01 = "Text";
         string02 = "TExT";

        System.out.println(string01.equals(string02)); // посимвольное сравнение строк
        System.out.println(string01.equalsIgnoreCase(string02)); // посимвольное сравнение строк без учета регистра

        if (string01.equals(string02)) {
            System.out.println("equal");
        }

        else {
            System.out.println("not equal");
        }


        // конкатенация строк

        string01 = "Java";
        string02 = "Phyton";


        // + эквивалентен созданию строки через констурктор, если обращение к строкам через переменные
        String concatString = string01 + " :: " +string02;
        System.out.println(concatString);

//        String concatString = "Java" + " :: " + "Phyton"; -> "Java" + :: + "Phyton"


        concatString = string01.concat(" :: ").concat(string02); // эквивалентно созданию строки через конструктор
        System.out.println(concatString);

        // в циклах нельзя использовать +, метод concat()  и др. методы,
        // которые приводит к созданию новых объектов



        // для создания длинных строк принято использовать другой тип данных
        // StringBuilder - один поток
        // или
        // StringBuffer - несколько потоков

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(i).append("  "); //CharSequence - накапливаемый тип данных
        }
        concatString = sb.toString();
        System.out.println(concatString);











    }
}
