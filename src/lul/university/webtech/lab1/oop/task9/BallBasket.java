package lul.university.webtech.lab1.oop.task9;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class BallBasket implements Iterable<Ball> {

    private final Collection<Ball> balls = new LinkedList<>();

    public BallBasket add(Ball ball) {
        balls.add(ball);
        return this;
    }

    @Override
    public Iterator<Ball> iterator() {
        return balls.iterator();
    }
}
