package academy.devdojo.maratonajava.javacore.Z_generics.domain;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                    "name = '" + name + '\'' +
                '}';
    }
}
