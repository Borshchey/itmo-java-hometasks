package ru.itmo.homeworks.hw18;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class University {

    // 1.Predicate для удаления курсов (тип Course) с названием python
    Course course01 = new Course("python");
    ArrayList<Course> courses = new ArrayList<>();

    public void removeCourse(Course course) {
        Predicate<Course> courseForRemove = courseName -> course.getName().equals("python");
        courses.removeIf(courseForRemove);
    }


    //2. `Predicate` для удаления курсов (тип Course) продолжительностью меньше 3 месяцев и стоимостью меньше 20000

    public void removeCourseWithOptions(Course course) {
        Predicate<Course> coursePredicate = courseName ->
                course.getPrice() < 20000  && course.getPeriod() < 90;
        courses.removeIf(coursePredicate);
    }


    // 3. `Function` для добавления к положительному числу строки " p."
    public void addLetter(Course course) {
        if (course.getPrice() > 0) {
            Function<Integer, String> convert = x -> String.valueOf(x) + " p.";
        }
    }

    //  Написать типизированный метод, который принимает на вход 3
    //   аргумента: `Predicate condition`, `Function ifTrue`, `Function ifFalse` и
    //   возвращает `Function` со следующей реализацией метода `apply`:
    //   если метод `test` экземпляра condition возвращает true,
    //   метод возвращает результат вызова метода apply аргумента ifTrue и наоборот

    public void task04(Predicate condition, Function ifTrue, Function ifFalse) {
        if (condition.test()) {
            return ifTrue.apply();
        } else return ifFalse.apply();
    }
}


