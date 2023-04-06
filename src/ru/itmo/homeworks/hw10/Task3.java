package ru.itmo.homeworks.hw10;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Task3 {


//    ### Задача 3
//    Допустим, занятия закончатся 16 июня 2023 года.
//    Сколько занятий осталось, если они проходят 3 раза в неделю (пн, ср, пт)?

    public static void main(String[] args) {

        LocalDate first = LocalDate.of(2023, Month.APRIL, 6);
        LocalDate second = LocalDate.of(2023, Month.JUNE, 12);

        long between = ChronoUnit.WEEKS.between(first, second);
        System.out.println("количество занятий: " + between * 3);

    }



}
