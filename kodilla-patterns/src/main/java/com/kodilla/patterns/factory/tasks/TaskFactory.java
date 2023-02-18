package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING -> new DrivingTask("Taxi", "Hollywood", "car");
            case PAINTING -> new PaintingTask("vanGogh", "yellow", "sunflowers");
            case SHOPPING -> new ShoppingTask("today!", "tomatoes", 10);
            default -> null;
        };
    }
}
