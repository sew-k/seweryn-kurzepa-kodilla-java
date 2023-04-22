package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface Observable {
    void registerHomeworkObserver(HomeworkObserver homeworkObserver);
    void notifyObserver(Task task);
}
