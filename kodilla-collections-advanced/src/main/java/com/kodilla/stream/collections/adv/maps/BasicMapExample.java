package com.kodilla.stream.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double>grades = new HashMap<>();
        grades.put( "Mathematics", 4.0 );
        grades.put( "Palstics", 6.0 );
        grades.put( "Music", 2.0 );

        Double grade = grades.get( "Mathematics" );
        System.out.println(grade);

        for (Map.Entry<String, Double>note : grades.entrySet()) {
            System.out.println("Grade of: " + note.getKey() +" is equals to " + note.getValue());

        }
    }
}
