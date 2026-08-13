package Exercises.workingWIthInterfaces;

public interface Drawable {
    // Create an interface named Drawable with a single method draw().
    void draw();

    // Modify the Drawable interface to include a default method erase().
    default void erase(){
        System.out.println("Erasing the drawing.");
    }

    // Create a class named Rectangle that implements two interfaces, Drawable and Countable,
    // each with a default method named printInfo().
    default void printInfo() {
        System.out.println("Printing information.");
    }
}
