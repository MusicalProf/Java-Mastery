package Exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    // Convert a list of strings to uppercase using a method reference.
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Pear", "Banana");
        List<String> upperCaseFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase Fruits:" + upperCaseFruits);
    }
}
