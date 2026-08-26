package Exercises.lambdaExpresionsAndFunctionalInterfaces;

public class LambdaExample {
    // Implement the Numeric Operator interface using a lambda expression to perform addition.
    public static void main(String[] args) {
        NumericOperator add = (x, y) -> x + y;
        int sum = add.operate(5, 6);
        System.out.println("Sum: " + sum);

        // Implement the NumericOperator interface using a lambda expression to find the maximum of two integers.
        NumericOperator max = (x, y) -> (x > y) ? x : y;
        int maxResult = max.operate(15, 11);
        System.out.println("Max: " + maxResult);

        // Implement the StringFormatter interface using a lambda expression to convert a string to uppercase.
        StringFormatter formatter = string -> string.toUpperCase();
        String test = formatter.format("Hello everyone!");
        System.out.println("Test string: " + test);
    }
}
