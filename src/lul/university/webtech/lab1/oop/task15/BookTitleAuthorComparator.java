package lul.university.webtech.lab1.oop.task9.task15;

import lul.university.webtech.lab1.oop.task9.task12.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int titleComparation = o1.getTitle().compareTo(o2.getTitle());
        if (titleComparation != 0) {
            return titleComparation;
        }
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
