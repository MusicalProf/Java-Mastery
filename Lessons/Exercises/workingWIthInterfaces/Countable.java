package Exercises.workingWIthInterfaces;

public interface Countable {
    // Create a class named Rectangle that implements two interfaces, Drawable and Countable,
    // each with a default method named printInfo().
    default void printInfo() {
        System.out.println("Printing information.");
    }
}
