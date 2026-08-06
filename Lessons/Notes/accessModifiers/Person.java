package Notes.accessModifiers;

public class Person {
    public String name; // Public access modifiers are the most accessible.
    // This can be accessed from anywhere in the same program.

    int age; // No explicit modifier means this is using default modifier.
    // Default modifier is package private.

    protected String city; // Can be accessed from in the same package and subclasses.

    private String secret; // This can only be accessed from within the class itself.
    // Getters and setters would need to be used to change this from outside the class.

    // This method is public which means it can be accessed just as easily as name.
    public void greet(){
        System.out.println("Hello, I'm " + name);
        tellSecret(); // This private method can go in this method, but it will return null.
    }

    private void tellSecret() { // Private method can only be accessed in this class.
        System.out.println("The secret is " + secret);
    }

    protected void sayGoodbye() {
        System.out.println("Goodbye my friend. Hope to see you another time.");
    }

    // Most restrictive modifier - Private
    // Less restrictive than Private - Default
    // Less restrictive than Protected - Protected
    // Most Accessible - Public

}


