package ru.itmo.homeworks.hw0708;

public class Bus extends Transport{

    private boolean isWifi;

    public Bus(int wearLevel, int number, String color) {
        super(wearLevel, number, color);
    }

    @Override
    public void repair(){
        super.repair();
        if (!isWifi) {
            isWifi = true;
        }
    }
}
