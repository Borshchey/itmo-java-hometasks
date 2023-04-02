package ru.itmo.homeworks.hw0708;

public class Car extends Transport{


    public Car(int wearLevel, int number, String color) {
        super(wearLevel, number, color);
    }

    @Override
    public void setColor(String color){
        if (color ==  null) {
            throw new IllegalArgumentException("Exception: color ==  null");
        }
        this.color = color;
    }

}
