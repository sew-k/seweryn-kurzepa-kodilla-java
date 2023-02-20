package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    Board board;
    @Autowired
    @Qualifier("toDoTaskList")
    TaskList toDoList;
    @Autowired
    @Qualifier("inProgressTaskList")
    TaskList inProgressList;
    @Autowired
    @Qualifier("doneTaskList")
    TaskList doneList;

    @Test
    void testBeans() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        List<String> resultList = new ArrayList<>();
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(b -> resultList.add(b));
        //Then
        Assertions.assertTrue(resultList.contains("toDoTaskList"));
        Assertions.assertTrue(resultList.contains("inProgressTaskList"));
        Assertions.assertTrue(resultList.contains("doneTaskList"));
    }
    @Test
    void testTaskAdd() {
        //Given
        board.getToDoList().addTask("First task to do");
        board.getInProgressList().addTask("First task in progress");
        board.getDoneList().addTask("First task done");
        System.out.println(board);

        //When & Then
        Assertions.assertTrue(board.getToDoList().getTasks().contains("First task to do"));
        Assertions.assertTrue(board.getInProgressList().getTasks().contains("First task in progress"));
        Assertions.assertTrue(board.getDoneList().getTasks().contains("First task done"));
    }
}
