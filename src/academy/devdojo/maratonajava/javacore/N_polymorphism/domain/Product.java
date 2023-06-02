package academy.devdojo.maratonajava.javacore.N_polymorphism.domain;

public abstract class Product implements TaxableProduct{
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
