package lul.university.webtech.lab1.fundamentals.task4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class PrimeFinder {

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int limit = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i < limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getPrimeIndexes(int[] array) {
        if (array == null) {
            throw new NullPointerException("Task 4 array cannot be null");
        }
        var indexes = new LinkedList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                indexes.add(i);
            }
        }
        return Collections.unmodifiableList(indexes);
    }

}
