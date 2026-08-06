package Exercises.Methods;

public class App {
    public static void main(String[] args) {
        //Create a method that performs several calculations on two input parameters and prints the results.
        // Invoke the method from another class.
        AdvancedCalculator.performCalculations(14, 9);
    }
}

class AdvancedCalculator{
    public static void performCalculations(int a, int b){
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}