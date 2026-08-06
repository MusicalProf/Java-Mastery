package Exercises.ControlFlowStatements;

import java.util.Scanner;

public class CommentOnStudentGradeUsingSwitch {
    public static void main(String[] args) {
        //Provide a comment on a student's grade using a switch statement.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        char grade = scanner.next(".").charAt(0);
        System.out.println("The grade is: " + grade);

        switch (grade) {
            case 'A', 'a':
                System.out.println("Excellent work! This will take you far!");
                break;
            case 'B', 'b':
                System.out.println("Good job! This is good. Keep pushing for excellence.");
                break;
            case 'C', 'c':
                System.out.println("This is an average grade. You've got more in you than average. " +
                        "Keep pushing.");
                break;
            case 'D', 'd':
                System.out.println("You're on the verge of failing. " +
                        "Let's get you out of this hole.");
                break;
            case 'F', 'f':
                System.out.println("You're failing, and it's not good. Seek my assistance asap.");
                break;
            default:
                System.out.println("Invalid grade, please enter a proper grade.");
        }
    }
}
