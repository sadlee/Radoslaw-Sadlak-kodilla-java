package com.kodilla.patterns222.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTask jimSmith = new StudentTask("Jim Smith");
        StudentTask jamesClarkson = new StudentTask("James Clarkson");
        StudentTask kimBassinger = new StudentTask("Kim Bassinger");
        Mentor mentor1 = new Mentor("Mentor One");
        Mentor mentor2 = new Mentor("Mentor Two");
        jimSmith.registerObserver(mentor1);
        jamesClarkson.registerObserver(mentor2);
        kimBassinger.registerObserver(mentor1);

        //When
        jimSmith.addTask("Task 1");
        jamesClarkson.addTask("Task 2");
        kimBassinger.addTask("Task 3");
        jamesClarkson.addTask("Task 4");
        jimSmith.addTask("Task 5");

        //Than
        assertEquals(2, jamesClarkson.getTasks().size());
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}