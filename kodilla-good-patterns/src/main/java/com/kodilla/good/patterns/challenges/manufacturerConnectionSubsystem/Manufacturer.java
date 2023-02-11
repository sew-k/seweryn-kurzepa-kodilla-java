package com.kodilla.good.patterns.challenges.manufacturerConnectionSubsystem;

public abstract class Manufacturer implements ManufacturerService {

    private String manufacturerName;
    private ManufacturerInformation manufacturerInformation;
    @Override
    public ManufacturerInformation getManufacturerInformation() {
        return manufacturerInformation;
    }
    @Override
    public void setManufacturerInformation(ManufacturerInformation manufacturerInformation) {
        this.manufacturerInformation = manufacturerInformation;
    }
    @Override
    public boolean isOrderCompleted(Order order) {
        if ((getManufacturerInformation().getManufacturerProducts().containsKey(order.getProductName())) &&
                (getManufacturerInformation().getManufacturerProducts().get(order.getProductName())) >= order.getProductQuantity()) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing order by '" + this.getManufacturerInformation().getManufacturerName() + "':" );
    }
}
