package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

public class Application {
    public static void main(String[] args) {

        CustomManufacturerProcessor customManufacturerProcessor = new CustomManufacturerProcessor(new ExtraFoodShopManufacturer(),
                new Order("Extra bread", 3));
        customManufacturerProcessor.processOrderFromManufacturer();
    }
}
