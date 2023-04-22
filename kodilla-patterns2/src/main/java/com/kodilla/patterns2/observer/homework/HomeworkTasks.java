package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class HomeworkTasks implements Observable {
    private final String studentName;
    private Deque<Task> tasks;
    private HomeworkObserver homeworkObserver;

    public HomeworkTasks(final String studentName) {
        this.studentName = studentName;
        tasks = new ArrayDeque<>();
    }

    @Override
    public void registerHomeworkObserver(HomeworkObserver homeworkObserver) {
        setHomeworkObserver(homeworkObserver);
    }
    public void notifyObserver(Task task) {
        getHomeworkObserver().update(this, task);
    }

    public String getStudentName() {
        return studentName;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Deque<Task> tasks) {
        this.tasks = tasks;
    }

    public HomeworkObserver getHomeworkObserver() {
        return homeworkObserver;
    }

    public void setHomeworkObserver(HomeworkObserver homeworkObserver) {
        this.homeworkObserver = homeworkObserver;
    }
    public void addTaskToCheck(Task task) {
        getTasks().add(task);
        notifyObserver(task);
    }
}
