package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.faktory.tasks.Task;
import com.kodilla.patterns.faktory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertTrue(shopping.executeTask());
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertTrue(painting.executeTask());
        assertEquals("Painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertFalse(driving.executeTask());
        assertEquals("Driving", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }
}
