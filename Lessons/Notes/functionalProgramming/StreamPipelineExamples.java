package Notes.functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPipelineExamples {
    public static void main(String[] args) {
        // These examples show how we can use the stream API to process data effectively

        // Example 1: Filtering and collecting a list of names.
        List<String> names = Arrays.asList("Walnut", "Mandarin", "Snowflake", "Bobby", "Roxy");
        List<String> namesStartingWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println("Names starting with B: " + namesStartingWithB);

        // Example 2: Finding the longest name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest Name: " + longestName);

        // Example 3: Transforming a list of strings into a set of integers.
        Set<Integer> uniqueInts = names.stream()
                .map(String::length)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("UniqueInts: " + uniqueInts);

        // Example 4: Concatenating strings with a custom separator
        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Concatenate Names: " + concatenatedNames);
    }
}
