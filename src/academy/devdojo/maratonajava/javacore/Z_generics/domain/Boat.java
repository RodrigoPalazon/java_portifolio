package academy.devdojo.maratonajava.javacore.Z_generics.domain;

public class Boat {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
