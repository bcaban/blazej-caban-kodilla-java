package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Heathrow Airport", true);
        flightsMap.put("Madrid Airport", true);
        flightsMap.put("Barcelona Airport", true);
        flightsMap.put("Rome Airport", false);

        if (flightsMap.get(flight.getArrivalAirport()) != null && flightsMap.get(flight.getArrivalAirport())) {

            System.out.println("The flight is from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }


        return flightsMap;
    }
}
