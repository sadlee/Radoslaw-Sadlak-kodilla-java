package com.kodilla.good.patterns.challenges.AirLine;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    public void searchTo(Set<Flights> theList, String nameAirPort) {

        theList.stream()
                .filter(l-> l.getNameAirPortTo().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void searchFrom(Set<Flights> theList, String nameAirPort) {

        theList.stream()
                .filter(l-> l.getNameAirPortFrom().equals(nameAirPort))
                .forEach(System.out::println);
    }

    public void searchThrough(Set<Flights> theList, String nameAirPort1, String nameAirPort2) {
        Set<Flights> list1 = theList.stream()
                .filter(l -> l.getNameAirPortFrom().equals(nameAirPort1))
                .collect(Collectors.toSet());
        Set<Flights> list2 = theList.stream()
                .filter(l -> l.getNameAirPortTo().equals(nameAirPort2))
                .collect(Collectors.toSet());
        for(Flights flight1 : list1){
            for(Flights flight2 : list2){
                if(flight1.getNameAirPortTo().equals(flight2.getNameAirPortFrom())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}