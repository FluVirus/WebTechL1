package oop.task12;

import oop.general.ISBNGenerator;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private long isbn;
    private static int edition;

    public Book (String title, String author, int price) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = ISBNGenerator.getDefault().getISBN();
    }

    protected Book (String title, String author, int price, long isbn) {
        this(title, author, price);
        this.isbn = isbn;
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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    protected long getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\" by " + author + ", price " + price + " (isbn: " + isbn + ")";
    }

    @Override
    public Book clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book another) {
        return Long.compare(isbn, another.isbn);
    }
}