package oop.general;

public final class ISBNGenerator {

    private static volatile ISBNGenerator instance;
    private long isbn;
    private ISBNGenerator() {
        isbn = 15;
    }
    public static ISBNGenerator getDefault() {
        if (instance == null) {
            synchronized (ISBNGenerator.class) {
                if (instance == null) {
                    instance = new ISBNGenerator();
                }
            }
        }
        return instance;
    }

    public long getISBN() {
        return isbn++;
    }

}
