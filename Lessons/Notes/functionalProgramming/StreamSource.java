package Notes.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {
        // Four ways of creating streams in Java. This is the source/starting point of a stream.
        // Creating a stream from a collection
        List<String> names = Arrays.asList("Jasmine", "John", "Jennie", "Jonah");
        Stream<String> namesStream = names.stream();

        // Creating a stream from an array
        String[] namesArray = {"Walnut", "Chyna", "Buddy"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a stream using the Stream.iterate() method
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n+1);

        // Creating a stream using the Stream.generate() method
        Stream<Double> randomNumbers = Stream.generate(Math::random);
    }
}
