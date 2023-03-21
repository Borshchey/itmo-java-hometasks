package hw3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Задача на использование любого цикла (выберите сами) ***
        //Пользователь загадывает число в диапазоне от [2 до 100]
        //Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
        //Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и в зависимоти от ответа пользователя принимать решения.
        //Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        //Подумайте, что можно сделать, если пользователь загадает число вне указанного диапазона.
        //Для вывода текста и значения переменной используйте оператор сложения, например System.out.println("Число равно " + number);

        int low = 2;
        int high = 100;
        Scanner in = new Scanner(System.in);

        while (low < high) {
            int computerNumber = low + (high - low) / 2;

            System.out.println("is it " + computerNumber + "?");
            System.out.println("sent '0' if your answer is 'no', and '1' if 'yes'");
            int userNumber = in.nextInt();

                    while (low < high) {

                        if (userNumber == 1) {
                            System.out.println("win");
                            break;
                        }
                        else if (userNumber == 0) {
                            System.out.println("is it more?");
                            userNumber = in.nextInt();

                            computerNumber = low + (high - low) / 2;

                            if (userNumber == 1) {
                                low = computerNumber + 1;
                                break;
                            } else {
                                high = computerNumber - 1;
                                break;
                            }
                        }
                    }

//                    switch (userNumber) {
//                        case 1:
//                            System.out.println("win");
//                            break;
//                        case 0:
//                            System.out.println("is it more?");
//                            userNumber = in.nextInt();
//
//                            computerNumber = low + (high - low) / 2;
//                            if (userNumber == 1) {
//                                low = computerNumber + 1;
//                                break;
//                            } else {
//                                high = computerNumber - 1;
//                                break;
//                            }
//                    }
                    }
        }
    }











