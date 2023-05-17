package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson05_ConditionalStructures_04 {
    public static void main(String[] args) {
        //Debiting taxes considering the salary

        Scanner scanner = new Scanner(System.in);
        double taxes;
        double taxesLowerSalary = 9.7/100D;
        double taxesMediumSalary = 37.35/100D;
        double taxesHighSalary = 49.50/100D;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Enter your annual salary: ");
        float annualSalary =  scanner.nextFloat();

        if(annualSalary <= 34712) {
            taxes = annualSalary * taxesLowerSalary;
        }else if(annualSalary >= 34713 && annualSalary <= 68507) {
            taxes = annualSalary * taxesMediumSalary;
        }else {
            taxes = annualSalary * taxesHighSalary;
        }

        double finalSalary = annualSalary - taxes;

        System.out.println("The cost of taxes that you must pay is: $" + decimalFormat.format(taxes));
        System.out.println("Your salary with the taxes discounted is: $" + decimalFormat.format(finalSalary));
    }
}
