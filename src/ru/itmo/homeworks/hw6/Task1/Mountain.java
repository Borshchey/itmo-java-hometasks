package ru.itmo.homeworks.hw6.Task1;

public class Mountain {

    // Гора создаётся с названием (не менее 4 символов),
    // страной (не менее 4 символов) и высотой (не менее 100 метров)

    private String title;
    private String country;
    private int high;

    public void setTitle(String title) {
        if (title == null || title.length() < 4) {
            throw new IllegalArgumentException("Название горы должно быть не менее 3 символов");
        }
        this.title = title;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Название горы должно быть не менее 3 символов");
        }
            this.country = country;
        }

    public void setHigh(int high) {
        if (high == 0 || high < 100) {
            throw new IllegalArgumentException("Высота горы должна быть не менее 100 метров");
        }
        this.high = high;
    }
}
