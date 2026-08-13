package Exercises.workingWithEnums.gameStatuesEnum;

enum GameStatus {
    // Create an enum named GameStatus that represents various possible statuses for a game.
    NOT_STARTED,
    IN_PROGRESS,
    PAUSED,
    COMPLETED
}

public class GameStatusesExample {
    // Create an enum named GameStatus that represents various possible statuses for a game.
    public static void main(String[] args) {
        for(GameStatus status : GameStatus.values()){
            System.out.println(status);
        }

        GameStatus gameStatus = GameStatus.PAUSED;
        System.out.println(gameStatus);
    }
}
