package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public interface DataLoader  {
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }
}
