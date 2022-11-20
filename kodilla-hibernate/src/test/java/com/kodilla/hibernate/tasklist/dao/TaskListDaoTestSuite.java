package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "My first list of";
    private static final String DESRIPTION = "tasks by Hibernate";

    @Test
    void testTaskListDaoFindByListName() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESRIPTION);
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

    @Test
    void testTaskListDaoSaveWithTasks() {

        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "toDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }
}
