package ru.itmo.homeworks.hw10;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {

//    ### Задача 1
//    Самолет летит из Сиднея в Оттаву с двумя остановками в Хьюстоне и Вашингтоне.
//    Самолет вылетает из Сиднея (дата любая, например 16 июня 2022) в 19:00 (время местное для Сиднея).
//
//            1. Время в пути Сидней -  Хьюстон - 15 часов 35 минут
//2. Время ожидания в аэропорту Хьюстона - 1 час
//3. Время в пути  Хьюстон - Вашингтон - 2 часа 49 минут
//4. Время ожидания в аэропорту Вашингтона - 1 час 10 минут
//5. Время в пути Вашингтон - Оттава - 1 час 40 минут
//
//    Вывести в консоль:
//            1. Время прибытия! в аэропорт Оттавы (время местное для Оттавы)
//2. Время вылета! из аэропорта Хьюстона (время местное для Хьюстона)
//3. Время вылета! из аэропорта Вашингтона (время местное для Вашингтона)
//
//    Часовые пояса:
//            1. Сидней - Australia/Sydney
//2. Хьюстон - America/Chicago
//3. Вашингтон - America/New_York
//4. Оттава - America/Toronto

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy в HH:mm");
        LocalDateTime first = LocalDateTime.of(2022, Month.JUNE, 16, 19, 00);

        first = first.plusHours(16);
        first = first.plusMinutes(35); // время вылета из Хьюстона по Сиднею
        ZonedDateTime sdn = first.atZone(ZoneId.of("Australia/Sydney"));
        ZonedDateTime hu = sdn.withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println("Время вылета из Хьюстона " + formatter.format(hu));

        first = first.plusHours(3);
        first = first.plusMinutes(59); // время вылета из Вашингтона по Сиднею
        sdn = first.atZone(ZoneId.of("Australia/Sydney"));
        ZonedDateTime ws = sdn.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Время вылета из Вашингтона " + formatter.format(ws));

        first = first.plusHours(1);
        first = first.plusMinutes(40); // время прибытия в Оттаву по Сиднею
        sdn = first.atZone(ZoneId.of("Australia/Sydney"));
        ZonedDateTime ot = sdn.withZoneSameInstant(ZoneId.of("America/Toronto"));
        System.out.println("Время приьытия в Оттаву " + formatter.format(ot));
    }

}
