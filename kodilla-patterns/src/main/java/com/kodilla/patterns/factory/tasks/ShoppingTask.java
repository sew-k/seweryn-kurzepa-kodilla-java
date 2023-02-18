package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean executed;


    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setExecuted(boolean executed) {
        this.executed = executed;
    }
}
