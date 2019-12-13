package com.kodilla.good.patterns.challenges.AirLine;

import java.util.Set;

public class App {
    public static void main(String[] args) {
        FlightsList listOfFight = new FlightsList();
        Set<Flights> list = listOfFight.getTheList();

        FlightSearch search1 = new FlightSearch();
        search1.searchFrom(list, "Gdansk");
        System.out.println();
        FlightSearch search2 = new FlightSearch();
        search2.searchTo(list, "Krakow");
        System.out.println();
        FlightSearch search3 = new FlightSearch();
        search3.searchThrough(list, "Gdansk", "Poznan");
        System.out.println();
    }
}