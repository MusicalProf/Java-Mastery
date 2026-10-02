package notes.functionalProgramming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {
        // Method references in Java are a shorthand syntax for lambda expressions. They refer to existing methods.
        // references to a static method
        Function<Integer, String> numToHexString = i -> Integer.toHexString(i);
        Function<Integer, String> numToHexStringRef = Integer::toHexString; // This will output the same as above.
        System.out.println(numToHexStringRef.apply(256));

        // reference to an instance method of a particular object
        String prefix = "Hello";
        Function<String, String> greet = s -> prefix + s;
        Function<String, String> greetMethodRef = prefix::concat;
        System.out.println(greetMethodRef.apply(" You"));

        // reference to an instance method of an arbitrary object of a particular type
        BiFunction<String, String, Integer> stringComparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringComparatorMethodRef = String::compareToIgnoreCase;
        System.out.println(stringComparator.apply("HI", "hi"));

        // reference to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("John");
        names.add("Jane");
        System.out.println(names.get(0));
    }
}
