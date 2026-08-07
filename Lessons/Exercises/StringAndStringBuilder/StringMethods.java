package Exercises.StringAndStringBuilder;

public class StringMethods {
    public static void main(String[] args) {
        // Use different methods available on the String class and print the results.
        String hello = "Hello, World!";
        System.out.println("Length of string: " + hello.length());
        System.out.println("Uppercase version: " + hello.toUpperCase());
        System.out.println("Lowercase version: " + hello.toLowerCase());
        System.out.println("Substring: " + hello.substring(7, 12));
        System.out.println("Replaced string: " + hello.replace("World", "Java"));

    }
}
