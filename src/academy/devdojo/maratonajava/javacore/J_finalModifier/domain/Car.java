package academy.devdojo.maratonajava.javacore.J_finalModifier.domain;

public class Car {
    public String name;
    public static final double LIMIT_SPEED = 250;
//    or
    //    static {
//        LIMIT_SPEED = 250;
//    }
//    or

//    public Car() {
//        LIMIT_SPEED = 250;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
