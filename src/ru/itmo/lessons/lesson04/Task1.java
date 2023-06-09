package ru.itmo.lessons.lesson04;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Ответьте на следующие вопросы:
        // 1. Что означает инициализация переменной? присвоение переменной какого-то значения
        // 2. Из каких символов может состоять имя переменной? латиница, кириллица, цифры
        // 3. Будет ли ошибкой использование кириллических символов в именах переменных? нет, но лучше не надо
        // 4. Какие примитивные типы есть в Java? int, long, byte, char, boolean, double, float
        // 5. Что такое var? ключевое слово для пременной без какого-либо типа
        // 6. Сколько байт занимает в памяти переменная типа long? 8 байт
        // 7. Что такое явное приведение типов? прямое указание на изменяемый тип получаемоего значения переменной
        // 8. Какой тип данных мы получим в результате сложения short и byte? short
        // 9. Какой тип данных мы получим в результате сложения long и float? float
        // 10. Как работает оператор && ? это логическое и: возвращает булевое значение true, если оба выражения слева и справа от оператора верны
        // 11. Что такое тело цикла? набор инструкций, выполняемых программой за 1 итерацию цикла
        // 12. Что такое итерация цикла? выполнение всех возможных инструкций в теле цикла за 1 раз
        // 13. Каким образом можно прервать выполнение цикла? break;
        // 14. Как будет работать следующее ветвление, если значение переменной равно 18 и если значение переменной равно 14?
        // if (age >= 18) System.out.println("Вы можете просматривать товары и совершать покупки");
        // else if (age < 18) System.out.println("Вы можете просматривать товары, но не совершать покупки");
        // на 18 распечатается 1ый текст, на 14 - второй
        // 15. Для чего программам нужен метод main? это точка входа в программу


        var x = 100;
        var y = 7l;
        var z = x + y; // 16. какой тип данных переменной z? - long

        var in01 = new Scanner(System.in); // 17. какой тип данных переменной in01? - Scanner (ссылочный)

        // 18. в чём причина ошибки? исправьте её
        var code = 1;
        // не хватало инициализации

        // 19. найти и исправить ошибки // некорректное условие сравнения и использование ==
        String login = "qwerty";
        String token = "22ffr";
        if (login.equals ("qwerty") && token.equals( "22ffr")) {
            System.out.println("Токен и логин указаны верно, Вы вошли в систему");
        }

        // 20. найти и исправить ошибки // неверное условие в if
        var in02 = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = in02.nextInt();
        if (age < 18 || age > 200) {
            System.out.println("Вы не можете совершать покупки");
        } else if (age >= 18 || age <= 200) {
            System.out.println("Вы можете совершать покупки");
        }

        // 21. найти и исправить ошибки
        Scanner in03 = new Scanner(System.in);
        System.out.println("Где хранятся строки в Java? Введите один из вариантов: пул строк, куча, хранилище строк.");
        String answer = in03.nextLine();
        switch (answer) {
            case "пул строк":
                System.out.println("Вы ввели верный вариант");
            case "куча":
                System.out.println("Вы правы, но лучше уточнить");
            case "хранилище строк":
            default:
                System.out.println("Вы ошиблись");
        }


        // 22. найти и исправить ошибку в решении задачи:
        // напечатать числа от 100 до 0, включая 100 и 0
        int start = 101;
        while (start > 0) {
            --start;
            System.out.println(start);
        }

        // 23. сколько раз будут выполнены инструкции из тела цикла? // ноль раз
        int first = 1, last = 15;
        for (; first > last; first++) {
            System.out.println(first);
        }

        // 24. Ответьте на вопросы:
        // 1. к какому блоку цикла for перейдет программа, когда значение переменной i будет равно 15,
        // к проверке условия или обновлению счётчиков? проверка условия
        // 2. Сколько раз произойдёт инициализация переменной i? один
        for (int i = 0; i < 30; i++) {
            if (i == 15) continue;
            System.out.println(i);
        }
    }
}

