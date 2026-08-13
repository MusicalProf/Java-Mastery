package Notes.handlingExceptions;

public class WrongInputException extends Exception {
    // You can create your own classes of exceptions.
    // Unchecked - Extend the Runtime Exception class or any of its subclasses.
    // Checked - Extend the Exception class or any subclass which doesn't extend the Runtime Exception class.
    // Three constructors
    // no args
    public WrongInputException() {
        super();
    }
    // accepts a string message
    public WrongInputException(String message){
        super(message);
    }
    // accepts another exception
    public WrongInputException(Exception e){
        super(e);
    }
}
