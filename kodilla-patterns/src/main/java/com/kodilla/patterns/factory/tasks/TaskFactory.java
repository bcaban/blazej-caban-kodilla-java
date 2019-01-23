package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String SHOPPING_TASK = "ShoppingTask";

    public final Task makeTask(String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving Task 1", "school", "bus");
            case PAINTING_TASK:
                return new PaintingTask("Painting Task 1", "blue", "car");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Task 1", "carrots", 3.0);
            default:
                return null;
        }
    }
}
