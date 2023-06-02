package academy.devdojo.maratonajava.javacore.N_polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.N_polymorphism.service.Tax_Calculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer_01 = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Siciliano", 10);

        Tax_Calculator.calcComputerTax(computer_01);
        System.out.println("----------------");
        Tax_Calculator.calcTomatoTax(tomato);
    }
}
