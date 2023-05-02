package ru.itmo.homeworks.hw18;

import java.util.Date;

public class Course {
    private String name;
    private int price;
    private long period;


    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public long getPeriod() {
        return period;
    }
}
