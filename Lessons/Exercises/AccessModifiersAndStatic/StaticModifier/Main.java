package Exercises.AccessModifiersAndStatic.StaticModifier;

public class Main {
    public static void main(String[] args) {
        // Create a class with a static field and method, and access them from another class.
        // Counter.count = 5;
        Counter.increment();
        System.out.println("Count: " + Counter.count);
    }
}
