package exercises.lambdaExpresionsAndFunctionalInterfaces;

@FunctionalInterface
public interface NumericOperator {
    // Create a functional interface named NumericOperator that represents an operation of two integers.
    int operate(int num1, int num2);
}
