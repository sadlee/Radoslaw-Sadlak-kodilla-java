package com.kodilla.exception.test;

public class MainAirport {
    public static void main(String[] args) {
        Flight flight = new Flight("Gdansk","Stansted");
        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}