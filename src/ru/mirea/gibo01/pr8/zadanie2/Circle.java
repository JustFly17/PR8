package ru.mirea.gibo01.pr8.zadanie2;

import java.util.Date;

public class Circle extends Shape {
    private Date sumDate;

    public Circle(int x, int y) {
        super(x, y);
    }

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "sumDate=" + sumDate +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String getType() {
        return "This is Circle";
    }
    public String sum() {
        sumDate = new Date();
        return "Sum is unknown";
    }
}
