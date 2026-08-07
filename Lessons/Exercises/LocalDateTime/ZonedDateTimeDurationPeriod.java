package Exercises.LocalDateTime;

import java.time.*;

public class ZonedDateTimeDurationPeriod {
    public static void main(String[] args) {
        //Create a ZonedDateTime object for an overseas event,
        // calculate the duration between two LocalTime objects,
        // and the period between two LocalDate objects.

        // ZonedDateTime for overseas
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Egypt"));
        System.out.println("The time in Egypt right now is: " + zonedDateTime);

        // Duration between LocalTime objects
        LocalTime localTime = LocalTime.of(9, 0);
        LocalTime localTime1 = LocalTime.of(17, 0);
        Duration duration = Duration.between(localTime, localTime1);
        System.out.println("The duration between two local times: " + duration);

        // Period between LocalDate objects
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        LocalDate localDate1 = LocalDate.of(2023, 12, 31);
        Period period = Period.between(localDate, localDate1);
        System.out.println("The period of time between two local dates: " + period);

    }
}
