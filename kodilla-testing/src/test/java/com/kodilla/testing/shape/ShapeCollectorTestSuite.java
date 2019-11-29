package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    public ShapeCollectorTestSuite() {
    }
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());

        //When
        shapeCollection.addFigure(new Triangle());

        //Then
        Assert.assertEquals(1, shapeCollection.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());
        Shape triangle = new Triangle();
        shapeCollection.addFigure(triangle);

        //When
        shapeCollection.removeFigure(triangle);

        //Then
        Assert.assertEquals(0, shapeCollection.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollection = new ShapeCollector(new Triangle());
        Shape triangle = new Triangle();
        shapeCollection.addFigure(triangle);

        //When
        String retrievedShape = shapeCollection.getFigure(0);

        //Then
        Assert.assertEquals(triangle, retrievedShape);
    }
}