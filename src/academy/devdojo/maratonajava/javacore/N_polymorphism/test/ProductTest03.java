package academy.devdojo.maratonajava.javacore.N_polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.N_polymorphism.service.Tax_Calculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product_01 = new Computer("iMac", 3500);
        Product product_02 = new Tomato("American Tomato", 20);
        Tomato product_03 = new Tomato("Subclass Tomato", 10);

        product_03.setExpirationDate("21/02/2023");

        Tax_Calculator.taxCalculator(product_01);
        System.out.println("-------------------");
        Tax_Calculator.taxCalculator(product_03);
    }
}
