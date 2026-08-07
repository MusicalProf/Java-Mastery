package Notes.datesAndTimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {
        // Duration and period represent lengths of time.
        // Duration is for time less than a day, expressed in nanoseconds.
        // Periods are for times more than a day, expressed in years, months, weeks, and days.
        Duration d1 = Duration.ofNanos(100000000);
        Duration d2 = Duration.ofSeconds(100, 1000);
        Duration d3 = Duration.ofDays(7);
        Duration d4 = d3.plus(d1);

        Period p1 = Period.of(10, 5, 6);
        Period p2 = Period.ofWeeks(12);

        System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4);
        System.out.println(p1 + "\n" + p2);
    }
}
