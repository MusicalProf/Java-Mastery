package controlflow;

import java.util.Scanner; // Using scanner for a more real world example.

public class ExamplesOfDoWhile {
    public static void main(String[] args) {
        int count = 0;

//        do { // Executes the code in the block at least once before checking the condition.
//            count ++;
//            System.out.println("Count is: " + count);
//        } while(count < 10);

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Please enter your name: ");
            input = scanner.nextLine();
            if(input.length() > 2) { // Additional if Statement added.
                System.out.println("Hello there, " + input + ".");
            }
        } while(input.length() < 2);

    }
}
