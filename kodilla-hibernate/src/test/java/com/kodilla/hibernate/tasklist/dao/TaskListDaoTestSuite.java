package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "My first list of";
    private static final String DESRIPTION = "tasks by Hibernate";

    @Test
    void testTaskListDaoFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME,DESRIPTION);
        TaskList taskList2 = new TaskList("aaa", "bbb");

        taskListDao.save(taskList);
        taskListDao.save(taskList2);

        //When
        List<TaskList> foundedTasks = taskListDao.findByListName(LISTNAME);

        //Then
        assertEquals(1, foundedTasks.size());
        assertEquals(2, taskListDao.count());
        assertEquals("My first list of", foundedTasks.get(0).getListName());

        //CleanUp
        taskListDao.deleteAll();

    }
}
