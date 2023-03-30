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

        Mountain mountain01 = new Mountain();
        Mountain mountain02 = new Mountain();
        Mountain mountain03 = new Mountain();

        Climber climber01 = new Climber("Ted", "NY123");
        Climber climber02 = new Climber("Sara","Msk123");
        Climber climber03 = new Climber("Joh", "Spb123");

        group01.setLength(3);
        group01.setMountain(mountain01);
        group02.setMountain(mountain02);
        group03.setMountain(mountain03);

        group01.addClimberToGroup(climber01);
        group01.addClimberToGroup(climber02);
        group01.addClimberToGroup(climber03);

        group02.addClimberToGroup(climber01);
        group02.addClimberToGroup(climber02);

        group03.addClimberToGroup(climber01);
        group03.addClimberToGroup(climber02);
    }
}