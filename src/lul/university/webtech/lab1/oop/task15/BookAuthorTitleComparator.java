package lul.university.webtech.lab1.oop.task9.task15;

import lul.university.webtech.lab1.oop.task9.task12.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComparation = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorComparation != 0) {
            return authorComparation;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

