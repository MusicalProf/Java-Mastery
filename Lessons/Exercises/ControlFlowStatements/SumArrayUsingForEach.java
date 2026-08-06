package Exercises.ControlFlowStatements;

public class SumArrayUsingForEach {
    public static void main(String[] args) {
        // Use a for-each loop to calculate the sum of an array of integers.
        int[] numbers = {3, 12, 41, 571, 9837};
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the numbers in the array is: " + sum);
    }
}
