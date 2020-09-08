package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void findFlightsFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlightFrom("Warszawa", new Flight("Warszawa", "Gdansk"));
        flightFinder.addFlightFrom("Gdansk",  new Flight("Gdansk", "Warszawa"));
        flightFinder.addFlightFrom("Warszawa",  new Flight("Warszawa", "Berlin"));

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Gdansk"));
        expectedList.add(new Flight("Warszawa","Berlin"));
        assertEquals(expectedList,result);

    }

    @Test
    public void findFlightsTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlightTo("Gdansk", new Flight("Warszawa", "Gdansk"));
        flightFinder.addFlightTo("Warszawa",  new Flight("Gdansk", "Warszawa"));
        flightFinder.addFlightTo("Berlin",  new Flight("Warszawa", "Berlin"));

        //when
        List<Flight> result = flightFinder.findFlightsTo("Berlin");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Berlin"));
        assertEquals(expectedList,result);


    }

}