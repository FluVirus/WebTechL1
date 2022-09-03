package fundamentals.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public abstract class IntervalCalculator {

    private static final double REPRESENTATION_ERROR = 0.000001;

    public static List<ArgResPair<Double, Double>> calculate(Function<Double, Double> function, Double a, Double b, Double h) {
        if (!(a <= b && h > 0)) {
            throw new RuntimeException("a must not be greater than b and h must be positive");
        }
        var results = new LinkedList<ArgResPair<Double, Double>>();
        for (double i = a; i <= b - REPRESENTATION_ERROR; i += h) {
            results.add(new ArgResPair<>(i, function.apply(i)));
        }
        results.add(new ArgResPair<>(b, function.apply(b)));
        return results;
    }
}
