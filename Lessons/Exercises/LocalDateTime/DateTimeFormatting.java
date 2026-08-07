package Exercises.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        // Format a LocalDateTime object and parse a date string into a LocalDate object.
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM/dd/yyyy HH:mm:ss");
        System.out.println("Today's formatted date and time: " + dateTimeFormatter.format(current));

        // Parse a date string into a LocalDate object.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse("11/21/2023", dtf);
        System.out.println(localDate);

    }
}
