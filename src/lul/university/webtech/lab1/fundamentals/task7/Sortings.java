package lul.university.webtech.lab1.fundamentals.task7;

public abstract class Sortings {

    public static void sortThisWay(double[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                double t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
                if (i > 0) {
                    i--;
                }
            }
        }
    }

}
