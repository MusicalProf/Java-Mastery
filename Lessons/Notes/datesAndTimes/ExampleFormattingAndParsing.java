package Notes.datesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ExampleFormattingAndParsing {
    public static void main(String[] args) {
        // DateTimeFormatter allows creation of your own dates and times format.
        LocalDateTime now = LocalDateTime.now();
        LocalDate today = LocalDate.now();

        // format with custom pattern
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(today));

        LocalDate ld = LocalDate.parse("August/06/2026", dtf);
        System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
        DateTimeFormatter dtf1 = dtfb.appendLiteral("The date is: ")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("/")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.YEAR_OF_ERA)
                .appendLiteral("-")
                .appendLiteral("Week ")
                .appendValue(ChronoField.ALIGNED_WEEK_OF_YEAR)
                .toFormatter();

        System.out.println(ld.format(dtf1));

    }
}
