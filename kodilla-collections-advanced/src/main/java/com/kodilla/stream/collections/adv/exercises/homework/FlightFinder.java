package com.kodilla.stream.collections.adv.exercises.homework;


import java.util.*;

public class FlightFinder {
    private Map<String, List<Flight>> flightDeparture;
    private Map<String, List<Flight>> flightArrival;

    public FlightFinder(Map<String, List<Flight>> flightDeparture, Map<String, List<Flight>> flightArrival) {
        this.flightDeparture = flightDeparture;
        this.flightArrival = flightArrival;
    }


    public List<Flight> findFlightsFrom(String departure){
        return flightDeparture.get(departure);

    }
    public List<Flight> findFlightsTo(String arrival){
        return flightArrival.get(arrival);

    }

}
