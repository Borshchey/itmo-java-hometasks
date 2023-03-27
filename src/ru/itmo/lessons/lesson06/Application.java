package ru.itmo.lessons.lesson06;

import ru.itmo.lessons.lesson06.books.Author;
import ru.itmo.lessons.lesson06.books.Book;

public class Application {
    public static void main(String[] args) {

        // объект типа Author
        // экземпляр класса Author
        Author author01 = new Author();

        // обращение к свойствам
        author01.name = "Mike";
        author01.surname = "Crowed";

        // создать еще одного автора
        // задать другие значения свойств

        Author author02 = new Author();
        author02.name = "Ted";
        author02.surname = "Mosby";
        System.out.println(author02.name + " " + author02.surname);

        System.out.println(author02.getFullName());

        author01.printFullName();

        Book book01 = new Book();
        book01.setTitle("The one");
        book01.setAuthor(author01);

        System.out.println(book01.getTitle());
        System.out.println(book01.getAuthor().getFullName());
        book01.getAuthor().name = "jack";

        System.out.println(author01.name);

        Book book02 = new Book("test title", author01);
        System.out.println(book02.getTitle());








    }
}
