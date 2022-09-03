package oop.task13;

import oop.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook (String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgrammerBook) || !super.equals(obj)) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) obj;
        return this.level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return language + ", level " + level + ", " + super.toString();
    }
}
