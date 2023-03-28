package ru.itmo.homeworks.hw6.Task1;

public class Application {
    // В методе main (отдельного класса) создать: +
    //3 группы для восхождений на 3 различных горы. +
    //В первой группе 3 альпиниста (набор закрыт) +
    //Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)

    public static void main(String[] args) {

        Group group01 = new Group();
        Group group02 = new Group();
        Group group03 = new Group();

        group01.setGroupOpen(true);
        group02.setGroupOpen(true);
        group03.setGroupOpen(true);

        Mountain mountain01 = new Mountain();
        Mountain mountain02 = new Mountain();
        Mountain mountain03 = new Mountain();

        group01.setLength(3);
        group01.setMountain(mountain01);
        group02.setMountain(mountain02);
        group03.setMountain(mountain03);

        boolean check = group01.getIsGroupOpen();
        group01.addClimberToGroup(check, "Ted", "Mosby");
        group01.addClimberToGroup(check, "Joh", "Dow");
        group01.addClimberToGroup(check, "Sara", "Smith");

        check = group02.getIsGroupOpen();
        group02.addClimberToGroup(check, "Ted", "Mosby");
        group02.addClimberToGroup(check, "Joh", "Dow");

        check = group03.getIsGroupOpen();
        group03.addClimberToGroup(check, "Ted", "Mosby");
        group03.addClimberToGroup(check, "Sara", "Smith");
    }
}
