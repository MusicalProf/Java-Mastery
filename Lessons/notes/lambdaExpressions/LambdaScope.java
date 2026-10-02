package notes.lambdaExpressions;

public class LambdaScope {
    public static void main(String[] args) {
        int localVar = 6; // This is effectively final
//        localVar = 7; This will not work as it would result as this variable not being final.
        Calculator calculator = (a, b) -> a * b + localVar;
//      Calculator calculator = (localVar, b) -> localVar * b + localVar; This will not work either, as the var is
        // already defined in the scope.
        int result = calculator.calculate(3, 5);
        System.out.println(result);
    }
}
