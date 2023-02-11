package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

import java.util.HashMap;
import java.util.Map;

public class HealthyShopManufacturer extends Manufacturer {
    private static ManufacturerInformation manufacturerInformation = new ManufacturerInformation("Healthy Shop");
    public HealthyShopManufacturer() {
        Map<String,Integer> manufacturerProductsMap = new HashMap<>();
        manufacturerProductsMap.put("Bread", 20);
        manufacturerProductsMap.put("Butter", 15);
        manufacturerInformation.setManufacturerProducts(manufacturerProductsMap);
    }
    @Override
    public ManufacturerInformation getManufacturerInformation() {
        return this.manufacturerInformation;
    }
    @Override
    public void processOrder(Order order) {
        super.processOrder(order);
        System.out.println("now processing by HealthyShopManufacturer custom service:");
        System.out.println(order);
    }
}
