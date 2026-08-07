package Notes.datesAndTimes;

import java.time.LocalTime;
public class ExampleLocalTime {
    public static void main(String[] args) {
        // Represents a time without a date or a time zone.
        LocalTime lt = LocalTime.now();
        LocalTime lt1  = LocalTime.of(6, 30, 12);
        LocalTime lt2 = LocalTime.parse("23:43:55");

        System.out.println(lt + " " + lt1 + " " + lt2);

        LocalTime lt4 = lt.plusHours(3);
        System.out.println(lt4);
    }
}
