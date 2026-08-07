package Notes.datesAndTimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {
    public static void main(String[] args) {
        // Represents a Date and a Time without a Time zone.
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 11, 20, 10, 23, 33);
        LocalDateTime ldt3 = LocalDateTime.parse("2025-04-24T22:10:47");

        System.out.println(ldt1 + "\n" + ldt2 + "\n" + ldt3);
    }
}
