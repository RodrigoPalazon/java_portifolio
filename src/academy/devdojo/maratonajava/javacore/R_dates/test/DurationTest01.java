package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime dateNow = LocalDateTime.now();
        LocalDateTime dateAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours( 7);
        Duration duration_01 = Duration.between(dateNow, dateAfterTwoYears);
        Duration duration_02 = Duration.between(timeNow, timeMinusSevenHours);
        Duration duration_03 = Duration.ofDays(20);

        System.out.println(duration_01);
        System.out.println(duration_02);
        System.out.println(duration_03);
    }
}
