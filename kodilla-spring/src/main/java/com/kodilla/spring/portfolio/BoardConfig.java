package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoTaskList")
    TaskList toDoList;
    @Autowired
    @Qualifier("inProgressTaskList")
    TaskList inProgressList;
    @Autowired
    @Qualifier("doneTaskList")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoTaskList")
    public TaskList getToDoList() {
        return new TaskList("To do list");
    }
    @Bean(name = "inProgressTaskList")
    public TaskList getInProgressList() {
        return new TaskList("In progress list");
    }
    @Bean(name = "doneTaskList")
    public TaskList getDoneList() {
        return new TaskList("done list");
    }
}
