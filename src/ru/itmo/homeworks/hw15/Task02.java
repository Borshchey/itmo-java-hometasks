package ru.itmo.homeworks.hw15;

import java.util.*;

public class Task02 {

    private static List<String> task01(Map<String, String> map, String someString) {
        ArrayList<String> list01 = new ArrayList<>();
        for (Map.Entry<String, String> temp : map.entrySet()) {
            if (temp.getValue().equals(someString)) {
                list01.add(temp.getKey());
            }
        }
        return list01;
    }

    private static Map<String, Integer> task02(List<String> strings) {

        HashMap<String, Integer> hashMap01 = new HashMap<>();
        for (String string : strings) {
                if (hashMap01.containsKey(string)) {
                    hashMap01.put(string, hashMap01.getOrDefault(string, 0) + 1);
                } else {
                    hashMap01.put(string, hashMap01.getOrDefault(string, 1));
                }
        }
        return hashMap01;
    }

    private static Map<String, Long> task0301(String text) {
        HashMap<String, Long> map = new HashMap<>();
        String[] arr = text.split(" ");
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, 0L) + 1);
            } else {
                map.put(s, map.getOrDefault(s, 1L));
            }
        }
        return map;
    }

    private static Map<Integer, ArrayList<String>> task0302(String text) {
        //  1. Создать пустую map, для хранения строк и количества повторений (HashMap<Integer, ArrayList<String>>)
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        //  2. Создать массив строк из строки text (нужный метод найти самостоятельно)
        String[] arr = text.split(" ");
        for (String s : arr) {
            int lenght = s.length();
            if (map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, ) + 1);
            } else {
                map.put(s, map.getOrDefault(s, 1L));
            }
        }

        //      3.3. если ключ содержится (значит информация о строке из массива уже есть в мапе),
        //      получать значение (список) по данному ключу, добавлять строку (элемент массива) в полученный список,
        //      записывать в мапу ключ и список, с добавленной в него строкой
        //      3.4. если ключ не содержится, создавать пустой список (ArrayList<String>),
        //      добавлять в него строку (элемент массива), записывать в мапу ключ и созданный список
        return map;
    }

    public static List task0201(Map<String, String> map, String city) {
        List<String> list01 = new ArrayList<>();

        for (Map.Entry<String, String> cities : map.entrySet()) {
            if (cities.getValue().equals(city)) {
                list01.add(cities.getKey());
            }
        }
        return list01;
    }

    public static Map<String, Integer> task0202(List<String> words) {
        Map<String, Integer> map01 = new HashMap<>();
        for (String word : words) {
            map01.put(word, map01.getOrDefault(word, 0) + 1);
        }
        return map01;
    }
    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO (2.1) написать статический метод, который принимает на вход map (например, firstTaskMap) и город (например, city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(task0201(firstTaskMap, city));

        // TODO (2.2) дан список слов (например, words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов в списке
        //  в map вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(task0202(words));

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        System.out.println(task0301(text));
        System.out.println(task0302(text));
        task0303(text);

    }
    //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
    //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
    public static Map<String, Long> task020301(String text) {
        Map<String, Long> map = new HashMap<>();
        String[] strArr = text.split(" ");

        for (String word : strArr) {
            map.put(word, map.getOrDefault(word, 0L) + 1);
        }
        return map;
    }

    //  2. написать метод, который собирает все слова в группы по количеству букв:
    //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]

    public static Map<Integer, List<String>> task020302(String text) {
        Map<Integer, List<String>> map = new HashMap<>();
        String[] arr = text.split(" ");

        for (String word : arr) {
            if (map.containsKey(word.length())) {
                map.get(word.length()).add(word);
            } else {
                List<String> list01 = new ArrayList<>();
                list01.add(word);
                map.put(word.length(), list01);
            }
        }
        return map;
    }

    //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)
    public static Map<String, Integer> task020303(String text) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] arr = text.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                }
            }
        }
        System.out.println(map);
        return map;
    }


    private static void task0303(String text) {
        //  1. Создать массив строк из строки text (нужный метод найти самостоятельно)
        String[] arr = text.split(" ");

        //  2. Создать список из элементов массива, полученного в п.2 (способ создания списка из массива см в файле map.md)
        List<String> list = Arrays. asList(arr);

        //  3. Объявить переменную типа Map<String, Integer>, где - ключи (String) - слово, значения (Integer) - частота встречаемости,
        //  вызвать метод task02, передать в него список из п.2, значение которое вернет метод присвоить объявленной переменой
        //  (так мы получим слова и частоту повторений)
        Map<String, Integer> map = task02(list);

        //  4. Создать список (ArrayList<Map.Entry<String, Integer>>) из пар мапы, объявленной в п.3
        //  (для получения коллекции пар использовать метод map.entrySet())
        ArrayList<Map.Entry<String, Integer>> list02 = new ArrayList<>();

        //   7. Объявить объект класса ValuesComparator
        Comparator <Map.Entry<String, Integer>> comparator01 = new ValuesComparator();

        //   8. Вызвать метод sort() списка из п.4, передать в него компаратор из п.7
        Collections.sort(list02, comparator01);

        //   9. Написать цикл на 10 итераций (или по количеству элементов списка (если их меньше 10)).
        //   Цикл должен перебирать список п.4, на каждой итерации выводить в консоль значение свойства key (метод getKey) элемента списка
        for (Map.Entry<String, Integer> stringIntegerEntry : list02) {
            System.out.println(stringIntegerEntry.getKey());
        }
    }

    //  5. Объявить класс ValuesComparator implements Comparator<Map.Entry<String, Integer>>,
    //  он позволит отсортировать список из п.4 по значениям (частоте встречаемости слов)
    //  6. Интерфейс обяжет Вас написать реализацию метода public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2):
    //     2.1. у объектов o1 и o2 получить значения свойства value (метод getValue) и сравнить числа
    //     2.3. вернуть из метода 0, если числа равны,
    //     вернуть из метода отрицательное число, если значение value объекта o1 больше значения value объекта o2,
    //     вернуть из метода положительное число, если значение value объекта o1 меньше значения value объекта o2
    static class ValuesComparator implements Comparator<Map.Entry<String, Integer>>{
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
            return (o2.getValue() - o1.getValue());
        }
    }
}