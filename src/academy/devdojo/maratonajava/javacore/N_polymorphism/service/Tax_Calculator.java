package academy.devdojo.maratonajava.javacore.N_polymorphism.service;

import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.N_polymorphism.domain.Tomato;

public class Tax_Calculator {
    public static void calcComputerTax(Computer computer){
        System.out.println("Computer Tax Report: ");
        double tax = computer.calcTax();
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Tax: " + tax);
    }

    public static void calcTomatoTax(Tomato tomato){
        System.out.println("Tomato Tax Report: ");
        double tax = tomato.calcTax();
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getPrice());
        System.out.println("Tax: " + tax);
    }
}
