package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading Data from a File...");
    }
}
