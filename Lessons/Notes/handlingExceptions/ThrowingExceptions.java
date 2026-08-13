package Notes.handlingExceptions;

public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {
        divide(4, 0); // This will automatically throw an exception. ArithmeticException
    }
    public static void divide(int a, int b){
        if(b == 0){
            // Throwing an exception is done with the "throw" keyword and is followed
            // by the exception you'd like to throw.
            throw new ArithmeticException("Cannot divide by zero!"); // We can define the message we see in the stack.
        }
        System.out.println(a / b);
    }
}
// Exceptions are special objects which are important in Java to state something unexpected has happened.
// These happen at runtime.
// The goal of handling exceptions is to specify what to do when an exception has been thrown.

// Checked exceptions - Java compiler requires handling -> Method signature: throws or try/catch.
// Examples - IOException and SQLException. They deal with external dependencies.

// Unchecked exceptions - Compiler doesn't require handling. This would be fixed by fixing the code.
// Examples - IllegalArgumentExceptions and NullPointerExceptions. These happen at runtime.