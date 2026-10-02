package exercises.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    // Use the stream API to perform multiple intermediate operations on a list of strings
    public static void main(String[] args) {
        List<String> favFoods =
                Arrays.asList("Burgers", "Tacos", "Pasta", "Salad", "Eggs", "Greens");

        List<String> filteredFoods = favFoods.stream()
                .filter(food -> food.length() < 6)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and Transformed foods: " + filteredFoods);
    }
}
