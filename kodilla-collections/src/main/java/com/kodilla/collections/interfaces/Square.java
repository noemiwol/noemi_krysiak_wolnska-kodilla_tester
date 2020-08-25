package com.kodilla.collections.interfaces;

public class Square implements Shape {
    private double widht;

    public Square(double widht){
        this.widht = widht;
    }

    public double getArea(){
        return widht * widht;
    }

    public double getPerimeter(){
        return 4 * widht;
    }

}
