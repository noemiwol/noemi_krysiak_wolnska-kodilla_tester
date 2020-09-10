package com.kodilla.stream.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Square{" +
                "widht=" + widht +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare( square.widht, widht ) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash( widht );
    }
}

