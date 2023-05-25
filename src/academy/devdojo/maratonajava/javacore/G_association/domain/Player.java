package academy.devdojo.maratonajava.javacore.G_association.domain;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
