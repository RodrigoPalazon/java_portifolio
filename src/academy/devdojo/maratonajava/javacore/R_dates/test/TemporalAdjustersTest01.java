package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now_01 = LocalDate.now();
        now_01 = now_01.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now_01);
        System.out.println(now_01.getDayOfWeek());

        LocalDate now_02 = LocalDate.now();
        now_02 = now_02.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now_02);
        System.out.println(now_02.getDayOfWeek());

        LocalDate now_03 = LocalDate.now();
        now_03 = now_03.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now_03);
        System.out.println(now_03.getDayOfWeek());

        LocalDate now_04 = LocalDate.now();
        now_04 = now_04.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now_04);
        System.out.println(now_04.getDayOfWeek());
    }
}
