package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Data from a File...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from a File...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Override checkPermission 'default method' from interface");
    }
}
