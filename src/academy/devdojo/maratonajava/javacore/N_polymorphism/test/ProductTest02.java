package academy.devdojo.maratonajava.javacore.N_polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product_01 = new Computer("iMac", 3500);
        Product product_02 = new Tomato("American Tomato", 20);
        Tomato product_03 = new Tomato("Subclass Tomato", 10);

        System.out.println(product_01.getName());
        System.out.println(product_01.getPrice());
        System.out.println(product_01.calcTax());
        System.out.println("---------------");
        System.out.println(product_02.getName());
        System.out.println(product_02.getPrice());
        System.out.println(product_02.calcTax());
        System.out.println("---------------");
        product_03.setValidDate("02/01/2023");
        System.out.println(product_03.getValidDate());


    }
}
