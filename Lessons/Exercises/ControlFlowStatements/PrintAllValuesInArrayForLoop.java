package Exercises.ControlFlowStatements;

public class PrintAllValuesInArrayForLoop {
    public static void main(String[] args) {
        // Use a for loop to print all the values in an array.
        int[] numbers = {23, 73, 289, 49, 283};

        for(int i = 0; i < numbers.length; i++){
            System.out.println("At index " + i + " the number is: " + numbers[i]);
        }
    }
}
