package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(4,4);
    }

    @Override
    public void area() {

        double resultSquareArea = (getWidth()* getHeight());
        System.out.println("The area of the square is: "+ resultSquareArea);

    }

    @Override
    public void circumference() {

        double  resultCircumference = 4 * getHeight();
        System.out.println("The circumference of the square is: " + resultCircumference);

    }
}
