package lesson04;

public class Task2 {

    public static void main(String[] args) {
//        replaceAll / replaceFirst
//        contains / startsWith / endsWith
//        trim / strip / stripIndent / stripLeading / stripTrailing
//        compareTo / compareToIgnoreCase
//        isBlank / isEmpty
//        repeat
//        toLowerCase / toUpperCase
//        charAt

        String s1 = "123456789";
        String s2 = "qwedrtyui    ";

        String res = s1.replaceAll("1", "3");

        System.out.println(res);

        System.out.println(res.contains("qwe"));

        System.out.println(s2.trim());

        System.out.println(s1.compareTo(s2));

        String s4 = "  ";
        System.out.println(s4.isBlank());

        System.out.println(s1.repeat(3));

        String sentence = "I love Java";
        char ch1 = sentence.charAt(0);
        char ch2 = sentence.charAt(5);
        char ch3 = sentence.charAt(9);
        System.out.println("The character with index number 0 is: " + ch1);
        System.out.println("The character with index number 5 is: " + ch2);
        System.out.println("The character with index number 9 is: " + ch3);

    }
}
