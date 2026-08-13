package Notes.interfaces;

public interface Predator { // The name starts with a capital letter.
    void catchAndEat(); // Methods typically have no body, and are public by default.

    // Default methods allow for implementation of an interface without having to implement every method in
    // the interface. Introduced in Java 8.
    default void eatPrey(Prey prey){
        System.out.println("Eating " + prey.getClass().getName());
    }

    default void run() {
        System.out.println("Predator is running");
    }

    // Private methods were introduced in Java 9. Added to avoid duplicate code. These can only be used within
    // the interface.
    private void privateMethod() {
        System.out.println("This is an example private method.");
    }

    // Static methods are similar to static methods in a class. Static methods can be called using the name of
    // the interface. They can also be called without creating an instance of the interface.
    public static void staticMethod() {
        System.out.println("This is an example static method.");
    }
}
