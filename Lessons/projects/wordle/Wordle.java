package projects.wordle;

import java.util.Scanner;

public class Wordle {
    private final String secretWord;
    private final int attempts;

    public Wordle(String secretWord, int attempts){
        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    public void play(){
        Scanner scanner = new Scanner(System.in);
        int attemptCounter = 0;
        while(attemptCounter < attempts ){
            System.out.printf("Attempts remaining: %d\n", attempts - attemptCounter);
            System.out.println("Please enter your word attempt: ");
            String guess = scanner.nextLine();

            if(guess.length() != secretWord.length()){
                System.out.printf("Please enter a word that is %d letters long.\n",  secretWord.length());
                continue;
            }

            int correctLetters = 0;
            int correctPositions = 0;

            for(int i =0; i < secretWord.length(); i++){
                char c = guess.charAt(i);
                if(c == secretWord.charAt(i)){
                    correctPositions++;
                } else if (secretWord.indexOf(c) >= 0) {
                    correctLetters++;
                }
            }

            if(guess.equalsIgnoreCase(secretWord) && correctPositions == secretWord.length()) {
                System.out.printf("You guessed the correct word %s! Congratulations!", secretWord);
                break;
            } else {
                System.out.println("You guessed the incorrect word! Try again!");
                System.out.println("Correct letters: " +  correctLetters);
                System.out.println("Correct positions: " +  correctPositions);
                attemptCounter++;
            }

            }
        if(attemptCounter == attempts){
            System.out.println("You've run out of attempts for this word. Better luck next time!");
        }
    }
}
