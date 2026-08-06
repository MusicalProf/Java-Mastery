package Exercises.ControlFlowStatements;

public class PrintFirstNEvenNumbersWhileLoop {
    public static void main(String[] args) {
//      Use a while loop to print the first N even numbers.
        int n = 12;
        int counter = 0;
        int i = 0;

        while(counter < n){
            if(i % 2 == 0) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
    }
}
