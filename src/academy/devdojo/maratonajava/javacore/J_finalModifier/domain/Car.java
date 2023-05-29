package academy.devdojo.maratonajava.javacore.J_finalModifier.domain;

//If you set a class with a final modifier, it means that class
//cannot be extend for other classes
//e.g.: public final class Car
public class Car {
    public String name;
    public static final double LIMIT_SPEED = 250;
    public final Buyer BUYER = new Buyer();

    public final void printData(){
        System.out.println(this.name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
