package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.area();
        square.circumference();

        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.circumference();


        Triangle triangle = new Triangle();
        triangle.area();
        triangle.circumference();
    }
}
