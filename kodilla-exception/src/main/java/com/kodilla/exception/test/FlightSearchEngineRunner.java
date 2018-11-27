package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearchEngineRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw Chopin Airport", "Rome Airport");
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            Map<String, Boolean> result = flightSearchEngine.findFlight(flight1);
            System.out.println(result);


        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found.");

        } finally {
            System.out.println("End of the program");

        }
    }
}
