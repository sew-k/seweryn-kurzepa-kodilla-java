package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

public class CustomManufacturerProcessor {

    private Manufacturer manufacturer;
    private Order order;

    public CustomManufacturerProcessor(Manufacturer manufacturer, Order order) {
        this.manufacturer = manufacturer;
        this.order = order;
    }

    public void processOrderFromManufacturer() {
        System.out.println("Getting information from " + manufacturer.getManufacturerInformation().getManufacturerName() + ":");
        System.out.println(" - products: " + manufacturer.getManufacturerInformation().getManufacturerProducts());

        System.out.println("Processing the order:");
        manufacturer.processOrder(order);

        System.out.println("Getting information is order completed: " + manufacturer.isOrderCompleted(order));
    }
}
