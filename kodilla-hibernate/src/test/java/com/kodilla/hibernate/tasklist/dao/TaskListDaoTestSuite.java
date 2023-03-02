package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList toDoList = new TaskList("ToDo", "List of tasks that need to be done");
        taskListDao.save(toDoList);
        String name = toDoList.getListName();

        //When
        List<TaskList> resultList = taskListDao.findByListName(name);

        //Then
        Assertions.assertEquals(1, resultList.size());

        //CleanUp
        int id = resultList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
