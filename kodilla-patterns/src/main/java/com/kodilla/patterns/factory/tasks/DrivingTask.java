package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean executed;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    public boolean isExecuted() {
        return executed;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }
}
