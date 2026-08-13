package Notes.handlingExceptions;

public class CustomCheckedException {
    // Create a custom checked exception, create a method that might throw it,
    // call this method and deal with the exception.
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 120){
            throw new InvalidAgeException("The age is invalid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(-5);
        }catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done.");
    }
}
