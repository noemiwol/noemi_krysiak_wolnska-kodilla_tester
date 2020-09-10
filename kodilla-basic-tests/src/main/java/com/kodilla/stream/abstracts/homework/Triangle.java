package com.kodilla.stream.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(3,5);
    }
    @Override
    public void area() {
        double resultTriangleArea = (getWidth() * getHeight()) / 2;
        System.out.println("The area of the triangle is: " + resultTriangleArea);

    }

    @Override
    public void circumference() {
        double resultTriangleCircumference = (getWidth()+getWidth()+getHeight());
        System.out.println("The circumference of the triangle is: " + resultTriangleCircumference);

    }
}
