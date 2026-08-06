package Exercises.Methods;

public class Main {
    public static void main(String[] args) {
        int sum = Calculator.add(5, 10);
        System.out.println("The sum is: " + sum);
    }
}

class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
}