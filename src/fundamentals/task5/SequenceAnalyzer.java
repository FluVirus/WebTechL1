package fundamentals.task5;

public abstract class SequenceAnalyzer {

    public static int getNumberToExclude(int[] array) {
        int numberToExclude = 0;
        for (int i = 1; i < array.length; ) {
            if (array[i] <= array[i - 1]) {
                int k = i;
                while (k < array.length && array[k] <= array[i - 1]) {
                    k++;
                }
                numberToExclude += k - i;
                i = k;
            } else {
                i++;
            }
        }
        return numberToExclude;
    }

}