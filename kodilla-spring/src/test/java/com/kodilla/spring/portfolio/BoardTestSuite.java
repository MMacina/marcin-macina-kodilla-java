package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        board.getTodoList().addTask(new Task("To do Task"));
        board.getInProgressList().addTask(new Task("In progress Task"));
        board.getDoneList().addTask(new Task("Done Task"));
    }
}
