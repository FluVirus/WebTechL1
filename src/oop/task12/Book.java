package oop.task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book (String title, String author, int price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\" by " + author + ", price " + price;
    }
}
