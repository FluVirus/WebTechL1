package oop.task15;

import oop.task12.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int comparation = o1.getAuthor().compareTo(o2.getAuthor());
        if (comparation != 0) {
            return comparation;
        }
        comparation = o1.getTitle().compareTo(o2.getTitle());
        if (comparation != 0) {
            return comparation;
        }
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
