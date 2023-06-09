package academy.devdojo.maratonajava.javacore.P_wrappers.test;

import java.util.List;

public class WrapperTest01 {
//    primitive data types:
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1; // autoboxing, wrapping
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        booleanW.booleanValue();

        int num = byteW; //unboxing;

        Integer intW_02 = Integer.parseInt("2");
        System.out.println(intW_02.getClass());

        Boolean itIsTrue = Boolean.parseBoolean("TruE");
        System.out.println(itIsTrue);

        System.out.println("Character: " + Character.isLetterOrDigit('!'));
    }
}

