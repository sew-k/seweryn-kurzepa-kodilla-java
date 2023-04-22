package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements HomeworkObserver {
    private final String name;
    private int updateCount;

    public Mentor(final String name) {
        this.name = name;
    }
    @Override
    public void update(HomeworkTasks homeworkTasks, Task task) {
        System.out.println(getName() + "- you have new homework task to check '" + task.getTaskName() +   "', in homework tasks list student " +
                homeworkTasks.getStudentName() + "\n" + " (for this student total: " +
                homeworkTasks.getTasks().stream().filter(t -> !t.isCompleted()).count() +
                " to check)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
