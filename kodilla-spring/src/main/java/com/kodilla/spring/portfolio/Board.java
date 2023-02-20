package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }
    //public void addTaskToList(TaskList taskList, String task) {
    //    taskList.addTask(task);
    //}

    @Override
    public String toString() {
        return "Board{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
