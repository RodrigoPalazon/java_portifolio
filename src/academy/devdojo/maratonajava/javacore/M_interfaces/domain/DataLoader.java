package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public interface DataLoader  {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Within retrieveMaxDataSize method from 'DataLoader' interface .");
    }
}
