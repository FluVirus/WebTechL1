package fundamentals.task2;

public abstract class Area {

    public static boolean isPointWithin(double x, double y) {
        return (y >= 0 && y <= 5.0 && x >= -4 && x <= 4) ||
               (y >= -3.0 && y <= 0 && x >= -6 && x <= 6) ;
    }

}
