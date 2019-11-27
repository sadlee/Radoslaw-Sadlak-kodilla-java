package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    ArrayList<Integer> oddArrayExtract = new ArrayList<Integer>();
    ArrayList<Integer> normalArrayList = new ArrayList<Integer>();
    ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();

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
        System.out.println("empty arrayList size: " + emptyArrayList.size());
        System.out.println("normal arrayList size: " + normalArrayList.size());

        OddNumbersExterminator completedList = new OddNumbersExterminator(emptyArrayList);
        completedList.exterminate(emptyArrayList);
        System.out.println("empty arrayList size: " + emptyArrayList.size());
        System.out.println("normal arrayList size: " + normalArrayList.size());

        Assert.assertEquals(normalArrayList, emptyArrayList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        Random randomNumber = new Random();
        for (int i=0; i<50; i++) {
            normalArrayList.add(randomNumber.nextInt((int) Math.pow(2, 15) - 1));
            if (normalArrayList.get(i) % 2 == 0) {
                oddArrayExtract.add(normalArrayList.get(i));
            }
            System.out.println(normalArrayList.get(i));
        }
        System.out.println("list generation completed,arrayList size: " + normalArrayList.size());

        OddNumbersExterminator completedList = new OddNumbersExterminator(normalArrayList);
        completedList.exterminate(normalArrayList);

        for (Object i : normalArrayList) {
            System.out.println(i.toString());
        }
        System.out.println("list odd numbers extermination completed,arrayList size: " + completedList.size());

        for (Object i : oddArrayExtract) {
            System.out.println(i.toString());
        }
        System.out.println("list of even numbers extract,arrayList size: " + oddArrayExtract.size());

        Assert.assertEquals(oddArrayExtract, normalArrayList);
    }
}