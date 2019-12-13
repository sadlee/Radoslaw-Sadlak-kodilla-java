package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Gdansk", true);
        airport.put("Stansted", true);
        airport.put("Heathrow", true);
        airport.put("Chopin", true);
        airport.put("Balice", true);

        if (airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport possible: " + flight.getArrivalAirport());
        } else
            throw new RouteNotFoundException("No such airport");
    }
}