package oop.general;

public final class ISBNGenerator {

    private static volatile ISBNGenerator instance;
    private long isbn = 5768346335L;

    private ISBNGenerator() {}

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
        isbn = (isbn - 1) % Long.MAX_VALUE;
        return isbn;
    }

}
