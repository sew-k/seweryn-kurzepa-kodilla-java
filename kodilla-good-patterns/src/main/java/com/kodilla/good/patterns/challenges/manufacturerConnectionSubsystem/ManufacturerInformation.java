package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

import java.util.HashMap;
import java.util.Map;

public class ManufacturerInformation {
    private String manufacturerName;
    private Map<String, Integer> manufacturerProducts = new HashMap<>();

    public ManufacturerInformation(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Map<String, Integer> getManufacturerProducts() {
        return manufacturerProducts;
    }

    public void setManufacturerProducts(Map<String, Integer> manufacturerProducts) {
        this.manufacturerProducts = manufacturerProducts;
    }
}
