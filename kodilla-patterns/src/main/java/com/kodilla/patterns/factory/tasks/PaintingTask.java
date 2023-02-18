package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String whatToPaint;
    private final String color;
    private boolean executed;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.executed = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public void executeTask() {
        System.out.println("Executing task " + getTaskName());
        setExecuted(true);
    }
    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public String getColor() {
        return color;
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }
}
