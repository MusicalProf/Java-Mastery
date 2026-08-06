package Exercises.ControlFlowStatements;

public class DetermineHighestAndLowestGrades {
    public static void main(String[] args) {
        // Determine the highest and lowest grades in a list of student grades using control flow statements.

        int[] grades = {85, 93, 87, 56, 72, 100};
        int min = grades[0];
        int max = grades[0];

        for(int i = 0; i < grades.length; i++){
            if(min > grades[i]){
                min = grades[i];
            }
            if(max < grades[i]){
                max = grades[i];
            }
        }
        System.out.println("Minimum grade: " + min);
        System.out.println("Maximum grade: " + max);
    }
}
