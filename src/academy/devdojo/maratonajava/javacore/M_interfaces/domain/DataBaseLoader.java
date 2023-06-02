package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public class DataBaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading Data Base...");
    }
}
