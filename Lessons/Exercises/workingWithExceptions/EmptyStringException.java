package Exercises.workingWithExceptions;

public class EmptyStringException extends Exception{
    // Create a method that throws a custom checked exception when a provided string is empty.
    public EmptyStringException(){
        super();
    }
    public EmptyStringException(String message){
        super(message);
    }
    public EmptyStringException(Exception e){
        super(e);
    }
}
