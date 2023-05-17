package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;

public class Lesson06_RepetitionStructures05 {
    public static void main(String[] args) {
        //    Given a car's price, find out how many installments it can be paid in
//    Condition: the installments' price must be >= 1000
            double carPrice = 30000;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");

            for(int numberInstallments = (int)carPrice; numberInstallments >= 1; numberInstallments--) {
                double installmentsPrice = carPrice/numberInstallments;
                if(installmentsPrice < 1000){
                    continue;
                }
                System.out.println(numberInstallments + "x" + " $ " + decimalFormat.format(installmentsPrice));
            }
    }
}
