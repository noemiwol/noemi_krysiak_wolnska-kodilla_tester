package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double width;
    private double height;

   public Shape(double width, double height){
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }


    public abstract void area();
    public abstract void circumference();


}
