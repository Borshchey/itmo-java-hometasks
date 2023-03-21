package lesson02;

import java.util.Scanner;

public class Lesson02 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите новое число");
//        int userNumber = in.nextInt();
//        System.out.println(userNumber * userNumber);


        //циклы while, for, do while
//        int printsCount = 5;
//        while (printsCount > 0) {
//            System.out.println("++++");
//            printsCount--;
//        }

//        boolean isActive = false;  //всегда false
//        while (isActive) {
//            System.out.println("++++");
//        }

//        boolean isActive = true;  //всегда true
//        while (isActive) {
//            System.out.println("++++");
//        }
//
//        while (true)  {
//            System.out.println("input int or 0");
//            userNumber = in.nextInt();
//            if (userNumber == 0) break;
//            if (userNumber < 0) continue;
//            System.out.println(userNumber * userNumber);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите количество тарелок");
//        int plateCounter = in.nextInt();
//        System.out.println("Введите количество моющего средства");
//        double cleaner = in.nextInt();
//
//        while (plateCounter > 0) {
//            plateCounter--;
//            if (cleaner < 0.5) break;
//            cleaner = cleaner - 0.5;
//
//            System.out.println("осталось моющего средства " + cleaner);
//        }
//        System.out.println("осталось " + plateCounter + " тарелок и моющего средства " + cleaner);

//        int a = 10;

//        for (int a = 10; a > 0; a--) {
//            System.out.println("+++");
//        }

        for (int a = 30; a > 0; a = a-5) {
            System.out.println(a);
        }
    }
}
