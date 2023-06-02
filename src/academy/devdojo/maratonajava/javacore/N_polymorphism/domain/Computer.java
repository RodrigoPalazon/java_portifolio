package academy.devdojo.maratonajava.javacore.N_polymorphism.domain;

public class Computer extends Product{
    public static final double TAX_PER_CENT = 0.21;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculating tax of Computer...");
        return this.price * TAX_PER_CENT;
    }


}
