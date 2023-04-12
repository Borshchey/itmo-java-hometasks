package ru.itmo.lessons.lesson06.books;

import java.util.Objects;

public class Book {

    private String title;
    private Author author;

    public Book() {
        System.out.println("создается книга");
    }

    public Book(String title, Author author) {
        this(); // вызов другого конструктора
        setAuthor(author);
        setTitle(title);
    }

    // methods

    public void setTitle(String bookTitle) {
        if (bookTitle == null || bookTitle.length() < 3) {
            throw new IllegalArgumentException("title не менее 3 символов");
        }
        title = bookTitle;
    }

    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("authorName не может быть null");
        }
        // this - ссылка на текущий объект
        this.author = author;
    }

    // возвращает значение title
    public String getTitle() {
        return title;
    }

    // возвращает значение author
    public Author getAuthor( ) {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
