package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    Board board;
    @Autowired
    TaskList toDoList;
    @Autowired
    TaskList inProgressList;
    @Autowired
    TaskList doneList;

    @Test
    void testBeans() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
    @Test
    void testTaskAdd() {
        //Given
        board.addTaskToList(toDoList, "First task to do");
        board.addTaskToList(inProgressList, "First task in progress");
        board.addTaskToList(doneList, "First task done");

        //When & Then
        Assertions.assertEquals("First task to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("First task in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("First task done", board.getDoneList().getTasks().get(0));
    }
}
