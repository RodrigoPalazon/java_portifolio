package academy.devdojo.maratonajava.javacore.R_dates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Locale;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime_01 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime_01);

        Instant nowInstant = Instant.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime_02 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime_02);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
