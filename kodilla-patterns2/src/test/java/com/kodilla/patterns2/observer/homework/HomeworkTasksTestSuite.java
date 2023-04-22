package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTasksTestSuite {
    @Test
    void testUpdate() {
        //Given
        Mentor johnSmith = new Mentor("John Smith");
        Mentor smithJohn = new Mentor("Smith John");

        HomeworkTasks krisTasks = new HomeworkTasks("Kristopher S.");
        krisTasks.registerHomeworkObserver(johnSmith);

        HomeworkTasks matheusTasks = new HomeworkTasks("Matheus M.");
        matheusTasks.registerHomeworkObserver(johnSmith);

        HomeworkTasks adamTasks = new HomeworkTasks("Adam L.");
        adamTasks.registerHomeworkObserver(johnSmith);

        HomeworkTasks stefanTasks = new HomeworkTasks("Stefan M.");
        stefanTasks.registerHomeworkObserver(smithJohn);

        //When

        krisTasks.addTaskToCheck(new Task("First task", "Task to check update"));
        krisTasks.addTaskToCheck(new Task("Second task", "Task to check update"));
        krisTasks.addTaskToCheck(new Task("Third task", "Task to check update"));
        krisTasks.addTaskToCheck(new Task("Fourth task", "Task to check update"));

        matheusTasks.addTaskToCheck(new Task("First task", "Task to check update"));
        matheusTasks.addTaskToCheck(new Task("Second task", "Task to check update"));

        adamTasks.addTaskToCheck(new Task("First task", "Task to check update"));
        adamTasks.addTaskToCheck(new Task("Second task", "Task to check update"));

        stefanTasks.addTaskToCheck(new Task("First task", "Task to check update"));

        //Then
        Assertions.assertEquals(johnSmith, krisTasks.getHomeworkObserver());
        Assertions.assertEquals(johnSmith, matheusTasks.getHomeworkObserver());
        Assertions.assertEquals(johnSmith, adamTasks.getHomeworkObserver());
        Assertions.assertEquals(8, johnSmith.getUpdateCount());

        Assertions.assertEquals(smithJohn, stefanTasks.getHomeworkObserver());
        Assertions.assertEquals(1, smithJohn.getUpdateCount());
    }

}