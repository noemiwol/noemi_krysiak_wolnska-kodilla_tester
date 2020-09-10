package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades>school = new HashMap<>();
        Student jonh = new Student( "Jonh", "Pickman" );
        Student donald = new Student( "Donald", "MCdafi" );
        Student jessi = new Student( "Jessi", "Obama" );

        Grades jonhGrades = new Grades(2.0, 5.0, 3.0, 2.0  );
        Grades donaldGrades = new Grades( 5.0, 5.0, 2.0, 4.0 );
        Grades jessiGrades = new Grades(6.0, 3.0, 4.0, 5.0  );

        school.put( jonh, jonhGrades );
        school.put( donald, donaldGrades );
        school.put( jessi, jessiGrades );

        System.out.println(school.get( jonh ));

        for (Map.Entry<Student, Grades>studentGradesEntry: school.entrySet()){
            System.out.println(studentGradesEntry.getKey().getFirstname() +
                    " , average: "+studentGradesEntry.getValue().getAverage());
        }
    }
}
