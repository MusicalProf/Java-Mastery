package notes.lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFunctionalInterface {
    public static void main(String[] args) {
        SupplierExample se = new SupplierExample();
        se.get(); // We wouldn't normally implment this way.

        Supplier<String> s1 = () -> "Hello!"; // This is the same implementation of the get method from the
        // Supplier interface.

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello, this is the consumer."); // The "accept" method accepts a generic.

        Predicate<String> p1 = s -> s.length() < 5; // Used to check a string.
        System.out.println(p1.test("Hello everybody!"));

        Function<String, Integer> f1 = s -> s.length(); // Can return a non-boolean
        System.out.println(f1.apply("Hello!"));
    }
}
