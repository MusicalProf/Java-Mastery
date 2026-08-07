package Exercises.WorkingWithConstructors.defaultConstructors;

public class DefaultConstructorExample {
    // Create a class named Vehicle and instantiate it using the default constructor.
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.model = "Honda";
        System.out.println("Vehicle " + vehicle.model + " has been created.");
    }
}
