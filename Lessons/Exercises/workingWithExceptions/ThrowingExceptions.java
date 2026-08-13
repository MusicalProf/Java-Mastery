package Exercises.workingWithExceptions;

public class ThrowingExceptions {
    // Create a method that throws an IllegalArgumentException if the provided number is negative.
    public static void validateNumber(int num) {
        if(num < 0){
            throw new IllegalArgumentException("Number cannot be negative.");
        }
    }
}
