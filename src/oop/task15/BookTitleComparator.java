package oop.task15;

import oop.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
