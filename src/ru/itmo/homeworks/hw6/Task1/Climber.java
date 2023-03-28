package ru.itmo.homeworks.hw6.Task1;

public class Climber {

    //Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).

    private String name;
    private String address;

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее 3 символов");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("Адрес проживания должен быть не менее 5 символов");
        }
        this.address = address;
    }
}
