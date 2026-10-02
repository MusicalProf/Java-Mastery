package notes.lambdaExpressions;

@FunctionalInterface // This annotation enforces this interface to have an abstract method.
public interface Calculator {
    // A functional interface is an interface which has a single abstract method.

    int calculate(int a, int b);

    default void print() {
        System.out.println("Hi");
    }
}
