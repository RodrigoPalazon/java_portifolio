package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MIN); // 00h
        System.out.println(LocalTime.MAX); // 23:59:59999999h
    }
}
