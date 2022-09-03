package fundamentals.task1;

import static java.lang.Math.sin;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public abstract class Expression {

    public static double compute(double x, double y) {
        double numerator = 1 + pow(sin(x+y), 2);
        double denominator = 2 + abs(x -  (2*x) / (1 + pow(x*y, 2)));
        return numerator/denominator + x;
    }

}