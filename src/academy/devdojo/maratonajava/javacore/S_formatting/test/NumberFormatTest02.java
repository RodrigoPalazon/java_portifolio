package academy.devdojo.maratonajava.javacore.S_formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormatArray = new NumberFormat[4];
        numberFormatArray[0] = NumberFormat.getCurrencyInstance();
        numberFormatArray[1] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormatArray[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormatArray[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 100_000_000.2134;

        for (NumberFormat numberFormat : numberFormatArray) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "￥100,000";
        try {
            System.out.println(numberFormatArray[2].parse(valueString));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

