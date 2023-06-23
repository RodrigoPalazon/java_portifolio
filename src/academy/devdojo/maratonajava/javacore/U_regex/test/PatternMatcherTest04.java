package academy.devdojo.maratonajava.javacore.U_regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \\d = All the digits
        // \\D = All the NOT digits
        // \\s = All the empty spaces: \t \n \f \r
        // \\S = All the NOT empty spaces
        // \\w = a-z, A-Z, 0-9, _
        // \\W = All that is not in \w (special char., empty spaces)
        //[]
        //? 0 or none
        //* zero or more
        //+ one or more
        //{n,m} from n to m
        //()
        //|
        //$
        //.  1.3 = 123, 133, 1@3, 1A3, etc...
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        String text = "*0x  0X 0X993BFA F 0Xa9G 0X123";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text: " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Found positions");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
// Hexadecimal number must start with '0x'.
//        int hexaNumber = 0X81108E3;
//        System.out.println(hexaNumber);
    }
}
