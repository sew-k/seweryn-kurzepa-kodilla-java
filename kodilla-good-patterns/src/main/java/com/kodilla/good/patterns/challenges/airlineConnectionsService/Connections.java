package com.kodilla.good.patterns.challenges.airlineConnectionsService;

import java.util.*;

public class Connections {

    private static Map<City, Set<City>> flights;
    static {
        City warsaw = new City("Warsaw");
        City cracow = new City("Cracow");
        City katowice = new City("Katowice");
        City gdansk = new City("Gdansk");
        City poznan = new City("Poznan");
        City vilnius = new City("Vilnius");
        flights = new HashMap<>();
        flights.put(warsaw, new HashSet<>(Arrays.asList(cracow, katowice, gdansk, poznan, vilnius)));
        flights.put(cracow, new HashSet<>(Arrays.asList(warsaw, gdansk, poznan)));
        flights.put(poznan, new HashSet<>(Arrays.asList(cracow, katowice, warsaw)));
        flights.put(katowice, new HashSet<>(Arrays.asList(warsaw, poznan)));
        flights.put(vilnius, new HashSet<>(Arrays.asList(warsaw)));
    }

    public static Map<City, Set<City>> getFlights() {
        return flights;
    }
}
