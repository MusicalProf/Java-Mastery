package Exercises.StringAndStringBuilder;

public class Immutability {
    public static void main(String[] args) {
        // Show that String objects are immutable by trying to modify one and printing the result.
        String str = "This is an immutable string. It will not change.";
        String uppercase = str.toUpperCase();

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + uppercase);
    }
}
