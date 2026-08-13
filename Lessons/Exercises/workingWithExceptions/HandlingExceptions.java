package Exercises.workingWithExceptions;



public class HandlingExceptions {
    public static void main(String[] args) {
        //Call the validateNumber method from the previous exercise
        // inside a try/catch block and handle the IllegalArgumentException.
        try{
            ThrowingExceptions.validateNumber(-5);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Done!");
    }
}
