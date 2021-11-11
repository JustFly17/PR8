package ru.mirea.gibo01.pr8.zadanie2;

import java.util.Date;

public class Rectangle extends Shape{

    private Date sumDate1;

    public Rectangle(int x, int y) {
        super(x, y);
    }

    int side1;
    int side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sumDate=" + sumDate1 +
                '}';
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    public double getPerimeter() {
        return 2*(side1 + side2);
    }

    public String getType() {
        return "This is Rectangle";
    }

    public String sum1() {
        sumDate1 = new Date();
        return "Sum is unknown";
    }
}
