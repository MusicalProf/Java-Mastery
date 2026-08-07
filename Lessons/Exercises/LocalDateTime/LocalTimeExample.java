package Exercises.LocalDateTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Create a LocalTime object representing a specific time and print it.
        LocalTime localTime = LocalTime.of(1, 30);
        System.out.println("Meeting Time: " + localTime + "pm");
    }
}
