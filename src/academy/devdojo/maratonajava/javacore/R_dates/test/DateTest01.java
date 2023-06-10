package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000L); // long 1000000
        System.out.println(date);
        System.out.println(date.getTime());
//      Adds one extra hour:
        date.setTime(date.getTime() + 3_600_000); // one hour converted to ms.
        System.out.println(date);
    }
}
