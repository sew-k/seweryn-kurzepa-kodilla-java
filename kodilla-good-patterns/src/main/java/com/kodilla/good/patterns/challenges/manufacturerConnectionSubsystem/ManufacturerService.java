package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

public interface ManufacturerService {
    void processOrder(Order order);
    ManufacturerInformation getManufacturerInformation();
    boolean isOrderCompleted(Order order);
    void setManufacturerInformation(ManufacturerInformation manufacturerInformation);
}
