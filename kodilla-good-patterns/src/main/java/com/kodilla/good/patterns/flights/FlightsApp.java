package com.kodilla.good.patterns.flights;

public class FlightsApp {

    public static void main(String args[]) {
        FlightSchedule flightSchedule = new FlightSchedule();
        System.out.println(flightSchedule.findFromCity("Lodz"));
        System.out.println(flightSchedule.findToCity("New York"));
        System.out.println(flightSchedule.findFlight("Warsaw", "New York"));

    }
}
