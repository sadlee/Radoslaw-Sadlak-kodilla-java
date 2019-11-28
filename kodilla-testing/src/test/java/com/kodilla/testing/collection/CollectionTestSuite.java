package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        Assert.assertEquals(emptyList, resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(2);
        normalList.add(1);
        normalList.add(4);
        normalList.add(10);
        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(10);

        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");

        Assert.assertEquals(expectedResultList, resultList);
    }
}