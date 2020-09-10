package com.kodilla.stream.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void findFlightsFrom(){
        //given
        Map<String, List<Flight>> departures = new HashMap<>();
        List<Flight> krakowDepartures = new ArrayList<>();
        krakowDepartures.add(new Flight("Krakow", "Warszawa"));
        krakowDepartures.add(new Flight("Krakow", "Poznan"));
        departures.put("Krakow", krakowDepartures);

        Map<String, List<Flight>> arrivals = new HashMap<>();
        List<Flight> warszawaArrivals = new ArrayList<>();
        warszawaArrivals.add(new Flight("Krakow", "Warszawa"));
        warszawaArrivals.add(new Flight("Poznan", "Warszawa"));
        arrivals.put("Warszawa", warszawaArrivals);

        FlightFinder flightFinder = new FlightFinder(departures, arrivals);
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Krakow");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Krakow", "Warszawa"));
        expectedList.add(new Flight("Krakow","Poznan"));
        assertEquals(expectedList,result);

    }

    @Test
    public void findFlightsTo(){
        //given
        Map<String, List<Flight>> arrivals = new HashMap<>();
        List<Flight> warszawaArrivals = new ArrayList<>();
        warszawaArrivals.add(new Flight("Krakow", "Warszawa"));
        warszawaArrivals.add(new Flight("Poznan", "Warszawa"));
        arrivals.put("Warszawa", warszawaArrivals);

        Map<String, List<Flight>> departures = new HashMap<>();
        List<Flight> krakowDepartures = new ArrayList<>();
        krakowDepartures.add(new Flight("Krakow", "Warszawa"));
        krakowDepartures.add(new Flight("Krakow", "Poznan"));
        departures.put("Krakow", krakowDepartures);
        FlightFinder flightFinder = new FlightFinder(departures, arrivals);


        //when
        List<Flight> result = flightFinder.findFlightsTo("Warszawa");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Krakow", "Warszawa"));
        expectedList.add(new Flight("Poznan", "Warszawa"));
        assertEquals(expectedList,result);


    }

}