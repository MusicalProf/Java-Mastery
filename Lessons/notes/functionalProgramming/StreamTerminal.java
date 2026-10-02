package notes.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        // Terminal operations are the endpoint of the stream. They are crucial for completing the stream pipeline.
        List<String> fruits = Arrays.asList("Strawberries", "Grapes", "Organic Kiwis", "Apples", "Bananas");
        Stream<String> fruitsStream = fruits.stream();

        // foreach - performs an action for every element in the stream.
        fruitsStream.forEach(System.out::println);

        // count - returns the number of elements in the stream.
        long numOfItems = fruits.stream().count(); // Can be replaced with Collections.size()
        System.out.println(numOfItems);

        // min, max - return the minimum and maximum elements in the stream
        Optional<String> min = fruits.stream().min((str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println(min.get()); // Max works in the exact same way as min.

        // allmatch - check if all the elements in the stream match a given predicate
        boolean allBiggerThan5 = fruits.stream().allMatch(s -> s.length() > 5);
        System.out.println("All bigger than 5: " + allBiggerThan5);

        // anymatch - check if any of the elements in the stream match a given predicate
        boolean anyBiggerThan5 = fruits.stream().anyMatch(s -> s.length() > 5);
        System.out.println("Any bigger than 5: " + anyBiggerThan5);

        // nonmatch - check if none of the elements in the stream match a given predicate
        boolean noneBiggerThan5 = fruits.stream().noneMatch(s -> s.length() > 5);
        System.out.println("None bigger than 5: " + noneBiggerThan5); // Should be false if the prior are true.

        // collect - transforms the stream into a different data structure, such as a List, Set, or Map
        List<String> fruitsList = fruits.stream().collect(Collectors.toList());
        // Java 16+
        List<String> fruitsList2 = fruits.stream().toList(); // easier syntax of above.
        System.out.println(fruitsList);
        System.out.println(fruitsList2); // Produces the same result as above.

        // reduce - applies a binary operator to the elements in the stream, reducing them to a single value
        Optional<String> totalString = fruits.stream().reduce(String::concat); // Method referencing.
        System.out.println(totalString.get());
    }
}
