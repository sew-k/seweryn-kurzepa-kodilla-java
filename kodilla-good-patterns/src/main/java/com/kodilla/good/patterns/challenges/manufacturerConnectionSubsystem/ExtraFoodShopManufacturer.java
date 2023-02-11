package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShopManufacturer extends Manufacturer {

    private ManufacturerInformation manufacturerInformation = new ManufacturerInformation("Extra Food Shop Sp z o.o.");

    public ExtraFoodShopManufacturer() {
        Map<String,Integer> manufacturerProductsMap = new HashMap<>();
        manufacturerProductsMap.put("Extra pancakes", 150);
        manufacturerProductsMap.put("Extra cookies", 150);
        manufacturerProductsMap.put("Extra bread", 20);
        manufacturerProductsMap.put("Extra butter", 15);
        manufacturerInformation.setManufacturerProducts(manufacturerProductsMap);
    }

    @Override
    public ManufacturerInformation getManufacturerInformation() {
        return this.manufacturerInformation;
    }

    @Override
    public void processOrder(Order order) {
        super.processOrder(order);
        System.out.println("now processing by ExtraFoodShopManufacturer custom service:");
        System.out.println(order);
    }

}
