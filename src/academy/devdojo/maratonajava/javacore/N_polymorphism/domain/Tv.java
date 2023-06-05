package academy.devdojo.maratonajava.javacore.N_polymorphism.domain;

public class Tv extends Product{
    public static final double TAX_PER_CENT = 0.21;
    public Tv(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcTax() {
        System.out.println("Calculating tax of Tv...");
        return this.price * TAX_PER_CENT;
    }
}
