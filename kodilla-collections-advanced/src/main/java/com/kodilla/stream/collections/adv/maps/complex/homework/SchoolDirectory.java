package com.kodilla.stream.collections.adv.maps.complex.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School>listOfPrincipal = new HashMap<>();
        Principal jozef = new Principal( "Józef", "Kowalski" );
        Principal zofia = new Principal( "Zofia", "Przech" );
        Principal tomasz = new Principal( "Tomasz", "Wilk" );

        School podstawowka = new School( "Teb", 400);
        School liceum = new School( "Żak", 120);
        School technikum = new School( "Cosinus", 80);

        listOfPrincipal.put( jozef,podstawowka );
        listOfPrincipal.put( zofia, liceum);
        listOfPrincipal.put( tomasz, technikum );

        for (Map.Entry<Principal, School>principalSchoolEntry: listOfPrincipal.entrySet()){
            System.out.println(principalSchoolEntry.getKey().getFirstname() + " "+principalSchoolEntry.getKey().getLastname() + " dane dotyczące szkoły, którą zarządza " +
                    principalSchoolEntry.getValue().getSchoolName() + " ma " +principalSchoolEntry.getValue().getNumberOfStudents()+ " uczniów.");
        }



    }
}
