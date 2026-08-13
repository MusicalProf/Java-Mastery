package Notes.handlingExceptions;

public class InvalidAgeException extends Exception{
    // Create a custom checked exception, create a method that might throw it,
    // call this method and deal with the exception.
    public InvalidAgeException(){
        super();
    }

    public InvalidAgeException(String message){
        super(message);
    }

    public InvalidAgeException(Exception e){
        super(e);
    }
}
