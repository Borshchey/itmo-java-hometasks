package hw2;

public class Task3 {

    // Задача на IF
    // Дан номер месяца, например int month = 5.
    // В зависимости от данного значения вывести в консоль время года
    public static void main(String[] args) {
        int month = 9;
        if (month < 3 || month > 11) System.out.println("winter");
        else if (month > 8) System.out.println("autumn");
        else if (month < 6) System.out.println("spring");
        else System.out.println("summer");
    }

}
