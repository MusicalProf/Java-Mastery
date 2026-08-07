package Exercises.LocalDateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing a specific date and time and print it.
        LocalDateTime localDateTime = LocalDateTime.of(2023, 11, 21, 18, 0);
        System.out.println("Event at: " + localDateTime);
    }
}
