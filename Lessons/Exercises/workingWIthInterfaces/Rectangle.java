package Exercises.workingWIthInterfaces;

public class Rectangle implements Drawable, Countable{
    // Create a class named Rectangle that implements two interfaces, Drawable and Countable,
    // each with a default method named printInfo().
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public void printInfo() {
        System.out.println("Printing rectangle info.");
    }
}
