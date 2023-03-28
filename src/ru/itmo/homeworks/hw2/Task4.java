package ru.itmo.homeworks.hw2;

public class Task4 {
    // Задача на IF
    //Дана целочисленная переменная count - количество верных ответов.
    // В зависимости от значения этой переменной вывести в консоль оценку:
    // 100 - 90 правильных ответов - отлично
    // 89 - 60 правильных ответов - хорошо
    // 59 - 40 правильных ответов - удовлетворительно
    // 39 - 0 правильных ответов - попробуйте в следующий раз

    public static void main(String[] args) {
        int count = 0;
        if (count >= 90) System.out.println("отлично");
        else if (count <=39) System.out.println("попробуйте в следующий раз");
        else if (count <= 59) System.out.println("удовлетворительно");
        else System.out.println("хорошо");
    }
}
