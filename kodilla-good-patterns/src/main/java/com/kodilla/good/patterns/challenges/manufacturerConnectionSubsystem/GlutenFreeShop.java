package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends Manufacturer {
    private static ManufacturerInformation manufacturerInformation = new ManufacturerInformation("Gluten Free Shop S.A.");
    public GlutenFreeShop() {
        Map<String,Integer> manufacturerProductsMap = new HashMap<>();
        manufacturerProductsMap.put("No gluten pancakes", 180);
        manufacturerProductsMap.put("Pure cookies", 151);
        manufacturerProductsMap.put("Bread with any gluten", 10);
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
        System.out.println("now processing by GlutenFreeShop custom service:");
        System.out.println(order);
    }
}
