package Exercises.ControlFlowStatements;

public class PrintASequenceOfNumbersDoWhile {
    public static void main(String[] args) {
        // Use a do-while loop to print a sequence of numbers from 1 to N.
        int n = 4;
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while(i <= n);
    }
}
