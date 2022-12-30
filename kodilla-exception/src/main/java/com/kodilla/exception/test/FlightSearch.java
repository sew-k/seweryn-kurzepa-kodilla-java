package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public static boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Cracow", true);
        airports.put("Bonn", false);
        airports.put("Warsaw", true);
        airports.put("Pcim", true);


        if (airports.containsKey(flight.getArrivalAirport())) {
            boolean result = airports.get(flight.getArrivalAirport());
            return result;
        } else {
            throw new RouteNotFoundException("Route not found!");
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Cologne");

        try {
            boolean airportAvailable = FlightSearch.findFlight(flight);
            if (airportAvailable) {
                System.out.println("Flight found.");
            } else {
                System.out.println("Flight found. Cancelled.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("End of program");
        }
    }
}
