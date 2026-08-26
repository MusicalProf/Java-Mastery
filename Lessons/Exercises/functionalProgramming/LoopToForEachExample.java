package Exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    // Rewrite a loop that prints each string in a list using the forEach method.
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello!", "I", "am", "Baymax.");
        // Using a forEach loop
        for(String string : strings) {
            System.out.println(string);
        }

        // Using forEach method and lambda expression
        strings.forEach(string -> System.out.println(string));
    }
}
