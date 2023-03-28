package ru.itmo.homeworks.hw6.Task1;

public class Group {

    // Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
    //идёт набор в группу или нет;
    //массив альпинистов;
    //гора;
    //должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт'

    private boolean isGroupOpen;
    private Climber[] climbers;
    private Mountain mountain;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }
    public void setGroupOpen(boolean isGroupOpen) {
        this.isGroupOpen = isGroupOpen;
    }
    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }
    public boolean getIsGroupOpen() {
        return isGroupOpen;
    }
    public String addClimberToGroup(boolean isGroupOpen, String climberName, String climberAddress) {
        if (isGroupOpen == false) {
            return ("Набор в группу закрыт");
        } else {
                for (int i = 0; i < length; i++) {
                    for (Climber person : climbers) {
                        if (person == null) {
                            person.setName(climberName);
                            person.setAddress(climberAddress);
                            break;
                        }
                    }
                }
            return ("Альпинист успешно добавлен");
        }
    }
}
