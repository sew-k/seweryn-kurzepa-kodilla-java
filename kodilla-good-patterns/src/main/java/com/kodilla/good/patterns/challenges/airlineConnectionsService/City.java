package com.kodilla.good.patterns.challenges.airlineConnectionsService;

public class City {
    private String CityName;

    public City(String cityName) {
        CityName = cityName;
    }

    public String getCityName() {
        return CityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return CityName.equals(city.CityName);
    }

    @Override
    public int hashCode() {
        return CityName.hashCode();
    }

    @Override
    public String toString() {
        return "City "+ CityName;
    }
}
