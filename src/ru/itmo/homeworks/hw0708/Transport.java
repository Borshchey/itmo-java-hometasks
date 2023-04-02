package ru.itmo.homeworks.hw0708;

abstract public class Transport {

    protected final int number;
    protected int wearLevel = 0;
    protected String color;

    public Transport(int wearLevel, int number, String color) {
        setWearLevel(wearLevel);
        this.number = number;
        setColor(color);
    }

    public void setWearLevel(int wearLevel) {
        this.wearLevel = wearLevel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void repair(){
        if (wearLevel == 0) {
            System.out.println("Уровень износа не может быть меньше нуля");
            }
            wearLevel--;
        }
}
