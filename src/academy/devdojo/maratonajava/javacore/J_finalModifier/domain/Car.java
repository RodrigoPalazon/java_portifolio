package academy.devdojo.maratonajava.javacore.J_finalModifier.domain;

public class Car {
    public String name;
    public static final double LIMIT_SPEED = 250;
    public final Buyer BUYER = new Buyer();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
