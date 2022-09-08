package lul.university.webtech.lab1.oop.task9.task15;

import lul.university.webtech.lab1.oop.task9.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
