package com.kodilla.stream.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add( new Stamp( "Red","4.5 x 5x5","Yes" ) );
        stamps.add( new Stamp( "Blue", "4.0 x 4.0", "No" ) );
        stamps.add( new Stamp( "Orange","2.5 x 5.0", "Yes" ) );
        stamps.add( new Stamp( "Red","4.5 x 5x5","No" ) );
        stamps.add( new Stamp( "Blue", "4.0 x 4.0", "Yes" ) );
        stamps.add( new Stamp( "Orange","2.5 x 5.0", "No" ) );
        stamps.add( new Stamp( "Red","4.5 x 5x5","Yes" ) );
        stamps.add( new Stamp( "Blue", "4.0 x 4.0", "No" ) );
        stamps.add( new Stamp( "Orange","2.5 x 5.0", "Yes" ) );

        System.out.println(stamps.size());
        for (Stamp stamp:stamps) {

            System.out.println(stamp);

        }
    }
}
