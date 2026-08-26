package Exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresExample {
    // Calculate the sum of squares of a list of integers using the reduce method
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumOfSquares = integers.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println("The sum of squares is " + sumOfSquares);
    }
}
