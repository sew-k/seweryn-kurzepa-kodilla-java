package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final String listName;
    private List<String> tasks;

    public TaskList(String listName) {
        this.listName = listName;
        this.tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        this.tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "listName='" + listName + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
