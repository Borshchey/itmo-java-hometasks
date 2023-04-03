package ru.itmo.homeworks.hw0708;

public class Train extends Transport{

    private int wagonsCount;
    private final String color = "blue";

    public Train(int wearLevel, int number, String color, int wagonsCount) {
        super(wearLevel, number, color);
        setWagonsCount(wagonsCount);
    }

    public void setWagonsCount(int wagonsCount) {
        if (wagonsCount <= 0) {
            System.out.println("Поезд не может быть без вагонов");
        }
        this.wagonsCount = wagonsCount;
    }

//    @Override
    public void repair(int wagonsCount){
        super.repair();
        setWagonsCount(wagonsCount);
    }

}
