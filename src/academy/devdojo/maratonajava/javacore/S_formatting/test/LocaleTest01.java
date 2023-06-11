package academy.devdojo.maratonajava.javacore.S_formatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwiss = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwiss);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println("Italy: " + df1.format(calendar.getTime()));
        System.out.println("Switzerland: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Netherlands: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeSwiss.getDisplayCountry(localeNetherlands));
        System.out.println(localeSwiss.getDisplayLanguage(localeJapan));
    }
}
