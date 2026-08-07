package Notes.datesAndTimes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExampleCalculating {
    public static void main(String[] args) {
        // You can calculate different times with methods.
        LocalDateTime now = LocalDateTime.now();
        // Duration can also be used to calculate dates and times.
        LocalDateTime oneHourFromNow = now.plus(Duration.ofHours(1));

        System.out.println(now + " + 1 hour = " + oneHourFromNow);

        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = today.minusYears(1);
        // Period is also and option of calculating.
        LocalDate oneYearAgo2 = today.minus(Period.ofYears(2));

        System.out.println(today + " - 1 year ago = " + oneYearAgo);
        System.out.println(today + " - 2 years ago = " + oneYearAgo2);
    }
}
