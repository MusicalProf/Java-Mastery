package Exercises.lambdaExpresionsAndFunctionalInterfaces;

@FunctionalInterface
public interface StringFormatter {
    // Create a functional interface named StringFormatter that represents a formatting operation on a string.
    String format(String str);
}
