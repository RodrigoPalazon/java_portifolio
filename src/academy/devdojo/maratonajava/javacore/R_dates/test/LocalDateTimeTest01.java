package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.of(2023, Month.AUGUST, 29);
        LocalDate date = LocalDate.parse("2023-08-29");
        LocalTime time = LocalTime.of(9, 45, 32);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
    }
}
