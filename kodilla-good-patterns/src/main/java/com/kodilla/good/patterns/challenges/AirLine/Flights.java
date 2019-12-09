package com.kodilla.good.patterns.challenges.AirLine;

public class Flights {
    private String nameAirPortFrom;
    private String nameAirPortTo;


    public Flights(String nameAirPortFrom, String nameAirPortTo) {
        this.nameAirPortFrom = nameAirPortFrom;
        this.nameAirPortTo = nameAirPortTo;
    }

    public String getNameAirPortFrom() {
        return nameAirPortFrom;
    }

    public String getNameAirPortTo() {
        return nameAirPortTo;
    }

    @Override
    public String toString() {
        return "Departure:" + nameAirPortFrom + '\'' +
                ", Arrival:" + nameAirPortTo + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flight = (Flights) o;

        if (nameAirPortFrom != null ? !nameAirPortFrom.equals(flight.nameAirPortFrom) : flight.nameAirPortFrom != null)
            return false;
        return nameAirPortTo != null ? nameAirPortTo.equals(flight.nameAirPortTo) : flight.nameAirPortTo == null;
    }

    @Override
    public int hashCode() {
        int result = nameAirPortFrom != null ? nameAirPortFrom.hashCode() : 0;
        result = 31 * result + (nameAirPortTo != null ? nameAirPortTo.hashCode() : 0);
        return result;
    }
}