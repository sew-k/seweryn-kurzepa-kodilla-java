package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //Then
        Assertions.assertEquals("Taxi", driving.getTaskName());
        Assertions.assertFalse(driving.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //Then
        Assertions.assertEquals("vanGogh", painting.getTaskName());
        Assertions.assertFalse(painting.isTaskExecuted());
    }
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        Assertions.assertEquals("today!", shopping.getTaskName());
        Assertions.assertFalse(shopping.isTaskExecuted());
    }
}
