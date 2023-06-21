package academy.devdojo.maratonajava.javacore.S_formatting.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse_01 = LocalDate.parse("20230621", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse_02 = LocalDate.parse("2023-06-21+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse_03 = LocalDate.parse("2023-05-21", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("===================");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse_04 = LocalDateTime.parse("2023-06-21T14:05:02.14181237", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse_04);

//        Custom
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("21/06/2023", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("21.Juni.2023", formatterGR);
        System.out.println(parseGR);
    }
}
