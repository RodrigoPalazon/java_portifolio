package academy.devdojo.maratonajava.javacore.X_serialization.domain;

public class Buddies {
    private String name;

    public Buddies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Buddies{" +
                "name='" + name + '\'' +
                '}';
    }
}
