package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task completeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Bakery", "Bread",2);
            case PAINTINGTASK:
                return new PaintingTask("Flat", "Blue", "Wall");
            case DRIVINGTASK:
                return new DrivingTask("Trip", "Kielce", "Car");
            default:
                return null;
        }
    }
}