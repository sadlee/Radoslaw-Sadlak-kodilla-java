package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.read();
        //nothing

        //Then
        Assert.assertEquals(0, board.getToDoList().getTasks().size());
        Assert.assertEquals(0, board.getInProgressList().getTasks().size());
        Assert.assertEquals(0, board.getDoneList().getTasks().size());
    }
}