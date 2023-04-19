package ru.itmo.homeworks.hw14.task02;

import java.util.*;

public class Task02 {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int countLow = 0;
        int countMedium = 0;
        int countHigh = 0;
        int countUrgent = 0;
        for (Message message : messageList) {
            if (message.getPriority() == Message.MessagePriority.LOW) countLow++;
            if (message.getPriority() == Message.MessagePriority.MEDIUM) countMedium++;
            if (message.getPriority() == Message.MessagePriority.HIGH) countHigh++;
            if (message.getPriority() == Message.MessagePriority.URGENT) countUrgent++;
        }
        System.out.println( "LOW:" + countLow +  " MEDIUM:" + countMedium + " HIGH:" + countHigh + " URGENT:"+ countUrgent);
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
    }


    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        Set<Message> uniqueMessageList = new HashSet<>();
        for (Message message : messageList) {
            uniqueMessageList.add(message);
        }
        System.out.println("количество уникальных сообщений: " + uniqueMessageList.size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]

        Set<Message> uniqueMessagesWithOriginalOrderSet = new LinkedHashSet<>();
        List uniqueMessageWithOrderList = new ArrayList();
        for (Message message : messageList) {
            if (uniqueMessagesWithOriginalOrderSet.add(message)) {
                uniqueMessageWithOrderList.add(message);
            }
        }
        return uniqueMessageWithOrderList;
    }

    public static void removeEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("вывод в консоль до удаления: " + messageList);
        List<Message> trashMessages = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getPriority() == priority) {
                trashMessages.add(message);
            }
        }
        messageList.removeAll(trashMessages);
        System.out.println("вывод в консоль после удаления: " + messageList);
    }

    public static void removeOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("вывод в консоль до удаления: " + messageList);
        List<Message> newMessagesList = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getPriority() == priority) {
                newMessagesList.add(message);
            }
        }
        System.out.println("вывод в консоль до удаления: " + newMessagesList);
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, Message.MessagePriority.HIGH);
        removeOther(messages, Message.MessagePriority.LOW);
    }
}