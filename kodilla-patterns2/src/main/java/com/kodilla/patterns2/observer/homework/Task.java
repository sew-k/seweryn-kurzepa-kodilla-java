package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String taskName;
    private String taskBody;
    private boolean completed;

    public Task(final String taskName, String taskBody) {
        this.taskName = taskName;
        this.taskBody = taskBody;
        completed = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskBody() {
        return taskBody;
    }

    public void setTaskBody(String taskBody) {
        this.taskBody = taskBody;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
