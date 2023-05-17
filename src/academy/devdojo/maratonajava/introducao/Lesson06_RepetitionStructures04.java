package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;

public class Lesson06_RepetitionStructures04 {
//    Given a car's price, find out how many installments it can be paid in
//    Condition: the installments' price must be >= 1000
    public static void main(String[] args) {
        double carPrice = 22000;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        for(int numberInstallments = 1; numberInstallments <= carPrice; numberInstallments++) {
            double installmentsPrice = carPrice / numberInstallments;
            if(installmentsPrice < 1000){
                break;
            }
                System.out.println(numberInstallments + "x" + " $" + decimalFormat.format(installmentsPrice));
        }
    }
}
