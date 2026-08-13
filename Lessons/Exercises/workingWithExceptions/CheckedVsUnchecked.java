package Exercises.workingWithExceptions;

public class CheckedVsUnchecked {
    // // Create a method that throws a custom checked exception when a provided string is empty.
    public static void validateString(String str) throws EmptyStringException{
        if(str.isEmpty()){
            throw new EmptyStringException("Your message is empty.");
        }
    }
}
