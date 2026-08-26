package Notes.functionalProgramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations are optional in the stream pipeline.
        List<String> games = Arrays.asList("Gears of War", "Spiderman", "Donkey Kong", "God of War", "Arc Raiders");

        // filter - filters the stream based on a predicate
        Stream<String> gamesStream = games.stream().filter(game -> game.startsWith("G"));
        gamesStream.forEach(System.out::println);

        // map - applies a function to each element of the stream
        Stream<Integer> gameLength = games.stream().map(String::length);
        System.out.println("Games length: " + gameLength.count());

        // flatMap - applies a function to each element in the stream and flattens the resulting stream into
        // a single stream
        List<List<String>> nestedGames = Arrays.asList(Arrays.asList("Pokemon", "NBA2K26"),
                Arrays.asList("Sonic Adventure 2", "Power Stone 2"));
        Stream<String> flatGames = nestedGames.stream().flatMap(Collection::stream);
        flatGames.forEach(System.out::println);

        // peek - performs an action on each element in the stream without modifying the stream
        Stream<String> gamesWithPeek = games.stream().peek(System.out::println);

        // limit - limits the stream to a certain number of elements
        Stream<String> firstThreeGames = games.stream().limit(3);
        firstThreeGames.forEach(System.out::println);

        // skip - skips the first n elements in the stream
        Stream<String> gamesWithoutFirst2 = games.stream().skip(2);
        gamesWithoutFirst2.forEach(System.out::println);

        // sorted - sorts the elements in the stream according to a comparator
        Stream<String> sortedGames = games.stream().sorted(Comparator.naturalOrder());
        sortedGames.forEach(System.out::println);
    }
}
