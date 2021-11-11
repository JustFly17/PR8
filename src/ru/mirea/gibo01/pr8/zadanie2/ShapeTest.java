package ru.mirea.gibo01.pr8.zadanie2;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Введите номер фигуры, для которой хотите узнать площадь и периметр, где 1 - " +
                "это окружность, а 2 - это прямоугольник: \n");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        if (in == 1) {
            System.out.println("Введите радиус окружности: \n");
            Circle circle = new Circle(5,6);
            Scanner sc = new Scanner(System.in);
            double r = sc.nextInt();
            circle.setRadius(r);
            System.out.println(circle.getType());
            System.out.println("Area is " + circle.getArea());
            System.out.println("Perimeter is " + circle.getPerimeter());
            System.out.println(circle.sum());
        }
        if (in == 2) {
            Rectangle rectangle = new Rectangle(6,1);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите 1-ю сторону прямоугольника");
            int side1 = sc2.nextInt();
            System.out.println("Введите 2-ю сторону прямоугольника");
            int side2 = sc2.nextInt();
            rectangle.setSide1(side1);
            rectangle.setSide2(side2);
            System.out.println(rectangle.getType());
            System.out.println("Area is " + rectangle.getArea());
            System.out.println("Perimeter is " + rectangle.getPerimeter());
            System.out.println(rectangle.sum1());
        }
    }
}
