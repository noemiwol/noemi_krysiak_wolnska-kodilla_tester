package com.kodilla.collections.adv.exercises.homework;


import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightRepository = new HashMap<>();

    public void addFlightFrom(String departure, Flight flight){
        List<Flight> flights = flightRepository.getOrDefault(departure, new ArrayList<>());
        flights.add(flight);
        flightRepository.put(departure, flights);
    }
    public void addFlightTo(String arrival, Flight flight){
        List<Flight> flights = flightRepository.getOrDefault(arrival, new ArrayList<>());
        flights.add(flight);
        flightRepository.put(arrival, flights);
    }


    public List<Flight> findFlightsFrom(String departure){
        return flightRepository.getOrDefault(departure, Collections.emptyList());

    }
    public List<Flight> findFlightsTo(String arrival){
        return flightRepository.getOrDefault(arrival, Collections.emptyList());

    }
}
