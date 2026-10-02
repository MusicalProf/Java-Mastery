package projects.wordle;

public class WordleGame {
    public static void main(String[] args) {
        Wordle game = new Wordle("Hello", 5);
        game.play();
    }
}
