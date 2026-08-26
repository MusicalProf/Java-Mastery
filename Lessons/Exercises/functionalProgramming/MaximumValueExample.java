package Exercises.functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    // Find the maximum value in a list of integers using the stream API.
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int maxValue = integers.stream()
                .max(Integer::compare)
                        .get();

        System.out.println("Maximum value is: " + maxValue);
    }
}
