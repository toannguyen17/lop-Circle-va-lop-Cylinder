package test;

import app.shape.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.toString());
        System.out.println("Area:   " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
