package Notes.datesAndTimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        // Represents a date without a time or a time zone.
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2000, 4, 1);
        LocalDate ld2 = LocalDate.parse("2023-03-05");

        System.out.println(ld + " " + ld1 + " " + ld2);

        LocalDate ld3 = ld.plusDays(5); // Returns a new date object with the days addedd.
        System.out.println(ld3);
        System.out.println(ld3.getYear());
        System.out.println(ld3.getDayOfMonth());
    }
}
