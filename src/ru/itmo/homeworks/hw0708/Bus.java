package ru.itmo.homeworks.hw0708;

public class Bus extends Transport{

    private boolean isWifi;
    private final String color;


    public Bus(int wearLevel, int number, String color) {
        super(wearLevel, number, color);
        this.color = color;
    }

    @Override
    public void repair(){
        super.repair();
        if (!isWifi) {
            isWifi = true;
        }
    }
}
