package Exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    // Count the number of even numbers in a list of integers using the stream API
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long numberOfEvens = nums.stream().
                filter(num -> num % 2 == 0)
                .count();
        System.out.println("Number of even integers: " + numberOfEvens);
    }
}
