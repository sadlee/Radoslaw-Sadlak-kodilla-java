package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.completeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();

        //Then
        Assert.assertEquals("Mall", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.completeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();

        //Then
        Assert.assertEquals("Flat", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.completeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();

        //Then
        Assert.assertEquals("Trip", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}