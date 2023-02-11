package com.kodilla.good.patterns.challenges.airlineConnectionsService;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ConnectionScanner {
    public void printConnectionsFromCityStream(String from) {
        City cityFrom = new City(from);
        Connections.getFlights().entrySet().stream()
                .filter(e -> e.getKey().equals(cityFrom))
                .map(e -> e.getValue())
                .map(s -> "Connections from " + cityFrom + " to: " + s)
                .forEach(System.out::println);
    }

    public void printConnectionsToCityStream(String to) {
        City cityTo = new City(to);
        Connections.getFlights().entrySet().stream()
                .filter(e -> e.getValue().contains(cityTo))
                .map(en -> en.getKey())
                .map(s -> "Connection to " + cityTo + " from: " + s)
                .forEach(System.out::println);
    }

    public void printConnectionsToCity(String to) {
        City cityTo = new City(to);
        Map<City, Set<City>> connections = Connections.getFlights();
        for (Map.Entry<City, Set<City>> entry : connections.entrySet()) {
            if (entry.getValue().contains(cityTo)) {
                System.out.println("Connection to " + cityTo + " from: " + entry.getKey());
            }
        }
    }

    public void printConnectionsWithIndirectFlight(String from, String to) {
        City cityTo = new City(to);
        City cityFrom = new City(from);
        Map<City, Set<City>> connections = Connections.getFlights();
        for (Map.Entry<City, Set<City>> entry : connections.entrySet()) {
            if (entry.getValue().contains(cityTo)) {
                for (Map.Entry<City, Set<City>> entry2 : connections.entrySet()) {
                    City stop = entry.getKey();
                    if (entry2.getKey().equals(cityFrom)) {
                        System.out.println("Connection from: " + cityFrom + " - "+ stop + " - " + cityTo);
                    }
                }
            }
        }
    }

    public void printConnectionsWithIndirectFlightStream(String from, String to) {
        City cityTo = new City(to);
        City cityFrom = new City(from);
        List<City> citiesListPotentialStopFrom = Connections.getFlights().entrySet().stream()
                .filter(e -> e.getKey().equals(cityFrom))
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());

        List<City> citiesListPotentialStopTo = Connections.getFlights().entrySet().stream()
                .filter(e -> e.getValue().contains(cityTo))
                .map(en -> en.getKey())
                .collect(Collectors.toList());

        citiesListPotentialStopFrom.stream()
                .filter(c -> citiesListPotentialStopTo.contains(c))
                .map(c -> c.toString())
                .map(s -> "Connection from: " + cityFrom + " - " + s + " - " + cityTo)
                .forEach(System.out::println);
    }
}
