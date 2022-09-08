package lul.university.webtech.lab1.fundamentals.task6;

public abstract class MatrixComposer {

    public static double[][] composeFrom(double[] source) {
        int n = source.length;
        double[][] matrix = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = source[(i + j) % n];
                }
            }
        return matrix;
    }

}
