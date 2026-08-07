package Exercises.StringAndStringBuilder;

public class StringBuilderExercise {
    public static void main(String[] args) {
        // Create two strings with the same value, compare them, concatenate them, and reverse them using StringBuilder.
        StringBuilder sb1 = new StringBuilder("This is a string builder instance.");
        StringBuilder sb2 = new StringBuilder("This is a string builder instance.");

        System.out.println("Equals: " + sb1.toString().equals(sb2.toString()));
        System.out.println("Concatenated: " + sb1.append(sb2));
        System.out.println("Reversed: " + sb1.reverse());

    }
}
