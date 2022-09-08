package lul.university.webtech.lab1.oop.task9;

import java.awt.Color;

public class Ball {

    private final double weight;
    private final Color color;

    public Ball (double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

}
