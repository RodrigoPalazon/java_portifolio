package academy.devdojo.maratonajava.javacore.N_polymorphism.domain;

public class Tomato extends Product{
    public static final double TAX_PER_CENT = 0.06;
    private String validDate;
    public Tomato(String name, double price) {
        super(name, price);
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @Override
    public double calcTax() {
        System.out.println("Calculation tomatoes tax...");
        return this.price * TAX_PER_CENT;
    }
}
