package exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    // Use the stream API to filter a list of integers and then square the remaining numbers
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 22, 9, 14, 10);
        List<Integer> oddNums = numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers Squared: " + oddNums);
    }
}
