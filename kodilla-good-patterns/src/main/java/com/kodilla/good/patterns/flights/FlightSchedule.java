package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSchedule {
    HashSet<Flight> flightList;

    public FlightSchedule() {
        this.flightList = new HashSet<>();
        flightList.add(new Flight("Warsaw", "Berlin"));
        flightList.add(new Flight("Berlin", "New York"));
        flightList.add(new Flight("LasVegas", "San Francisco"));
        flightList.add(new Flight("Lodz", "Cracow"));
        flightList.add(new Flight("Lodz", "Paris"));
        flightList.add(new Flight("Lodz", "London"));
        flightList.add(new Flight("Cracow", "Prague"));
        flightList.add(new Flight("Barcelona", "Lodz"));

    }

    public Set<Flight> findFromCity(String cityOfDeparture) {
        Set<Flight> flightsFrom = flightList.stream()
                .filter(departure -> departure.getCityOfDeparture().equals(cityOfDeparture))
                .collect(Collectors.toSet());

        return flightsFrom;
    }

    public Set<Flight> findToCity(String cityOfArrival) {
        Set<Flight> flightsTo = flightList.stream()
                .filter(arrival -> arrival.getCityOfArrival().equals(cityOfArrival))
                .collect(Collectors.toSet());

        return flightsTo;
    }

    public Set<Flight> findFlight(String cityOfDeparture, String cityOfArrival) {
        Set<Flight> fromCity = findFromCity(cityOfDeparture);
        Set<Flight> toCity = findToCity(cityOfArrival);
        Set<Flight> flights = new LinkedHashSet<>();
        for (Flight from : fromCity) {
            for (Flight to : toCity) {
                if (from.getCityOfArrival().equals(to.getCityOfDeparture())) {
                    flights.add(from);
                    flights.add(to);
                }
            }
        }
        return flights;
    }
}
