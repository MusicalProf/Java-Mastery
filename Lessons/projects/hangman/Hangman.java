package projects.hangman;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    private String secretWord;
    private int attempts;
    private StringBuilder guessedWord;
    private HashSet<Character> guessedLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord.toLowerCase();
        this.attempts = attempts;
        this.guessedWord = new StringBuilder(secretWord.replaceAll(".", "_"));
        this.guessedLetters = new HashSet<>();
    }

    String[] hangman = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========", // 0
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========", // 1
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========", // 2
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========", // 3
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========", // 4
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========", // 5
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="  // 6
    };

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int attemptCounter = 0;

        while(attemptCounter < attempts){
            System.out.printf("Attempts remaining: %d\n", attempts - (attemptCounter));
            System.out.println("Your current hangman state is: \n" + hangman[attemptCounter]);
            System.out.printf("The word is: %s\n", guessedWord.toString());
            System.out.println("Please enter your guess: ");
            char guessChar = scanner.next().charAt(0);

            if(guessedLetters.contains(guessChar)) {
                System.out.println("You've already guessed this letter. Please try again.");
                continue;
            }

            guessedLetters.add(guessChar);
            if(secretWord.indexOf(guessChar) >= 0) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guessChar) {
                        guessedWord.setCharAt(i, guessChar);
                    }
                }
            }else{
                attemptCounter++;
                System.out.println(hangman[attemptCounter]);
            }

            if(secretWord.equals(guessedWord.toString())){
                System.out.println("Congratulations! You've guessed the correct word: " + secretWord + "!");
                break;
            } else if (attemptCounter == attempts) {
                System.out.println("You've run out of attempts to guess. Please try again another time.");
            }
        }
    }
}
