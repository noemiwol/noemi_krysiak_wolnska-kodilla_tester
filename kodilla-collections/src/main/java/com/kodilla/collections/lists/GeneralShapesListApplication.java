package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add( new Circle( 15 ) );
        shapes.add( new Triangle( 10,15,20 ) );
        shapes.add( new Square( 25 ) );


        shapes.remove(new Triangle( 10,15,20 ));
        for (Shape shape:shapes) {
            System.out.println(shape + " area: " + shape.getArea() + " perimeter: " + shape.getPerimeter());

        }
    }
}
