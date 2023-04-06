package ru.itmo.homeworks.hw10;

import java.time.LocalTime;

public class Task2 {

//    ### Задача 2
//    Есть три рабочие смены:
//            1. с 7:00 до 15:00
//            2. с 15:00 до 23:00
//            3. с 23:00 до 7:00
//
//    Определить, какая сейчас смена (относительно текущего времени)
//
    public static void main(String[] args) {

        LocalTime current = LocalTime.now();

        String strWithTime = "07:00:00";
        LocalTime parseTime = LocalTime.parse(strWithTime);

        String strWithTime2 = "15:00:00";
        LocalTime parseTime2 = LocalTime.parse(strWithTime2);

        String strWithTime3 = "23:00:00";
        LocalTime parseTime3 = LocalTime.parse(strWithTime3);

        if (current.isAfter(parseTime) && current.isBefore(parseTime2)) {
            System.out.println("Первая смена");
        } else if (current.isAfter(parseTime3) && current.isBefore(parseTime3)) {
            System.out.println("Вторая смена");
        } else System.out.println("Третья смена");
    }
}
