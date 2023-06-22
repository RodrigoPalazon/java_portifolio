package academy.devdojo.maratonajava.javacore.U_regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \\d = All the digits
        // \\D = All the NOT digits
        // \\s = All the empty spaces: \t \n \f \r
        // \\S = All the NOT empty spaces
        // \\w = a-z, A-Z, 0-9, _
        // \\W = All that is not in \w (special char., empty spaces)
        String regex = "\\w";
//        String text_01 = "abaaba";
        String text_02 = "*@sadf2_ads_f2 sdf3   das3f\rsd3";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text_02);
        System.out.println("Text: " + text_02);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Found positions");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
