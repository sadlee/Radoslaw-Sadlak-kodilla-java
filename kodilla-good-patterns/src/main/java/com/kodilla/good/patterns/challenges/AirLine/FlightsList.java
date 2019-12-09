package com.kodilla.good.patterns.challenges.AirLine;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {
    private Set<Flights> theList = new HashSet<>();

    public FlightsList() {
        theList.add(new Flights("Gdansk", "Katowice"));
        theList.add(new Flights("Krakow", "Wroclaw"));
        theList.add(new Flights("Gdansk", "Wroclaw"));
        theList.add(new Flights("Warszawa", "Poznan"));
        theList.add(new Flights("Poznan", "Krakow"));
        theList.add(new Flights("Gdansk", "Warszawa"));
    }

    public Set<Flights> getTheList() {
        return new HashSet<>(theList);
    }
}