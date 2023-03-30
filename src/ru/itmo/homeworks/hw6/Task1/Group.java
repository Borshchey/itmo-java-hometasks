package ru.itmo.homeworks.hw6.Task1;

public class Group {

    // Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
    //идёт набор в группу или нет;
    //массив альпинистов;
    //гора;
    //должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт'

    private Climber[] climbers;
    private Mountain mountain;
    private int length = 10;

    public Group(){
        climbers = new Climber[10];
    }
    private int index; // счетчик альпинистов

    public void setLength(int length) {
        this.length = length;
    }
    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    public void addClimberToGroup(Climber climber) {
        if (climber == null) {
            System.out.println("Не может быть пустого альпиниста!");
            return;
        }
        if (index < climbers.length) {
            climbers[index] = climber;
            index++;
        } else {
            System.out.println("Набор в группу закрыт");
        }
    }
}
