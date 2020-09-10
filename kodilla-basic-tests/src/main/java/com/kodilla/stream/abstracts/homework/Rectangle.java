package com.kodilla.stream.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(5,8);
    }
    @Override
    public void area() {
        double resultRectangleArea = (getWidth() * getHeight());
        System.out.println("The area of the rectangle is: " + resultRectangleArea);

    }

    @Override
    public void circumference() {
        double resultRectangleCircumference = 2 * (getWidth() + getHeight());
        System.out.println("The circumference of the rectangle is: " + resultRectangleCircumference);

    }
}
