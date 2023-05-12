package academy.devdojo.maratonajava.introducao;

public class Lesson04_Operators {
    public static void main(String[] args) {
//        ArithmeticOperators: + - / *
        double num01 = 10;
        double num02 = 20;
        double result = num01 / num02;

        System.out.println(result);

//        Module %
        int rest = 20 % 3;
        System.out.println(rest);

//        Logic Operators < > <= >= == !=, always return a boolean value
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenEqualThanTwenty = 10 == 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        System.out.println("isTenGreaterThanTwenty ? " + isTenGreaterThanTwenty);
        System.out.println("isTenEqualThanTwenty ? " + isTenEqualThanTwenty);
        System.out.println("isTenDifferentThanTwenty ? " + isTenDifferentThanTwenty);

//        &&, ||, !
        int age = 17;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4000;
        boolean isLegalYoungerThanThirty = (age <= 30 && age >=18) && salary > 3200;
        boolean goodCitizen = false;

        if(isLegalOlderThanThirty && !goodCitizen) {
            System.out.println("Allowed to live and work in the country");
        }else if (isLegalYoungerThanThirty && !goodCitizen) {
            System.out.println("Allowed to live and work in the country");
        }
        else{
            System.out.println("NOT Allowed to live and work in the country");
        }

//        = += -= *= /= %=
        double credit = 1800;
        credit += 1000;
        credit *=2;
        double finalCredit = credit;

        System.out.println(finalCredit);
    }
}
