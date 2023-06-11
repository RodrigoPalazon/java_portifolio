package academy.devdojo.maratonajava.javacore.S_formatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormatArray = new NumberFormat[4];
        numberFormatArray[0] = NumberFormat.getInstance();
        numberFormatArray[1] = NumberFormat.getInstance(localeBR);
        numberFormatArray[2] = NumberFormat.getInstance(localeJP);
        numberFormatArray[3] = NumberFormat.getInstance(localeIT);
        double value = 100_000_000.2134;

        for (NumberFormat numberFormat : numberFormatArray) {
            System.out.println(numberFormat.format(value));
        }
    }
}

