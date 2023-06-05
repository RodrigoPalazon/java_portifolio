package academy.devdojo.maratonajava.javacore.N_polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tv;
import academy.devdojo.maratonajava.javacore.N_polymorphism.service.Tax_Calculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer_01 = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Siciliano", 10);
        Tv tv_01 = new Tv("LG Smart TV", 4500);


//        System.out.println(tv_01.calcTax());
        Tax_Calculator.taxCalculator(tv_01);
        System.out.println("----------------");
        Tax_Calculator.taxCalculator(computer_01);
        System.out.println("----------------");
        Tax_Calculator.taxCalculator(tomato);
    }
}
