package com.kodilla.patterns.faktory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping", "Milk", 1.00);
            case PAINTING -> new PaintingTask("Painting", "Blue", "walls");
            case DRIVING -> new DrivingTask("Driving", "To work", "with my car");
            default -> null;
        };
    }
}
