package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task completeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Mall", "Bread",2);
            case PAINTINGTASK:
                return new PaintingTask("House", "White", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Trip", "Gdansk", "Car");
            default:
                return null;
        }
    }
}