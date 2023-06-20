package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period period_01 = Period.between(dateNow, dateAfterTwoYears);
        Period period_02 = Period.ofDays(10);
        Period period_03 = Period.ofWeeks(58);
        Period period_04 = Period.ofMonths(3);
        Period period_05 = Period.ofYears(3);
        System.out.println(period_01);
        System.out.println(period_02);
        System.out.println(period_03);
        System.out.println(period_04);
        System.out.println(period_05);
        System.out.println(period_03.getMonths());
        System.out.println(Period.between(dateNow, dateNow.plusDays(period_03.getDays())).getMonths());
        System.out.println(dateNow.until(dateNow.plusDays(period_03.getDays()), ChronoUnit.DAYS));
    }
}
