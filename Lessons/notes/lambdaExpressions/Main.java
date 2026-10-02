package notes.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        // Lambda expressions are used to create instances of functional interfaces.
        Calculator c1 = (x, y) -> x + y; // Defining an expression that implements the Calculator interface.
        Calculator c2 = (x, y) -> x - y;
        System.out.println(c1.calculate(3, 5));
        System.out.println(c2.calculate(3, 5));

        Calculator c3 = (x, y) -> { // The method body can vary depending on the needs of the implementation.
            System.out.println("Hello from the lambda expressions");
            return x * y;
        };
        System.out.println(c3.calculate(3, 5));

        Printer p1 = p -> System.out.println("Printer says: " + p);
        p1.print("Hello!");

        NumberProvider np1 = () -> 42; // Interface with no arguments.
        System.out.println(np1.provide());

        int result1 = execute(3, 5, c1);
        int result2 = execute(3, 5, c2);
        int result3 = execute(3, 5, c3);
        int result4 = execute(3, 5, new CalculatorImpl()); // Without Lambda expression.
        int result5 = execute(3, 5, (x, y) -> x * y); // This is how we'd use lambda expressions
        // on the fly.

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }

    public static int execute(int num1, int num2, Calculator calculator){
        return calculator.calculate(num1, num2);
    }
}
