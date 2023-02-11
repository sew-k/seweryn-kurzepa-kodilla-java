package com.kodilla.good.patterns.challenges.airlineConnectionsService;

public class Application {
    public static void main(String[] args) {
        ConnectionScanner connectionScanner = new ConnectionScanner();
        System.out.println("Stream");
        connectionScanner.printConnectionsFromCityStream("Warsaw");
        System.out.println("");
        System.out.println("No Stream");
        connectionScanner.printConnectionsToCity("Gdansk");
        System.out.println("Stream");
        connectionScanner.printConnectionsToCityStream("Gdansk");
        System.out.println("");
        System.out.println("No Stream");
        connectionScanner.printConnectionsWithIndirectFlight("Cracow", "Katowice");
        System.out.println("Stream");
        connectionScanner.printConnectionsWithIndirectFlightStream("Cracow", "Katowice");
    }
}
