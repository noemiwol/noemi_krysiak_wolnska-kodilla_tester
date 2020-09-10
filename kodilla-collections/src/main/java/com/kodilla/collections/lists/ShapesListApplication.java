package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        shapes.add( new Square( 15 ) );
        shapes.add( new Square( 20 ));
        shapes.add( new Square( 25 ) );

       /* for (int n =0; n < shapes.size(); n++){
           Square square = shapes.get( n );
            if (square.getArea() > 20);
            System.out.println(square + " area: " + square.getArea());*/

        for (Square square:shapes) {
            if (square.getArea() > 20)
                System.out.println(square + " area: " + square.getArea());

        }
        }



    }
