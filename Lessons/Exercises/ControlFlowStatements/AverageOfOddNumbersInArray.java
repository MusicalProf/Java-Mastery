package Exercises.ControlFlowStatements;

public class AverageOfOddNumbersInArray {
    public static void main(String[] args) {
        //Calculate the average of odd numbers in an array using control flow statements.
        int[] numbers = {3, 72, 81, 34, 23, 7, 17, 9, 24};
        double sum = 0;
        double count = 0;

        for(int num : numbers){
            if(num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        double avg = sum / count;
        System.out.println("The average is: " + (int)avg);
    }
}
