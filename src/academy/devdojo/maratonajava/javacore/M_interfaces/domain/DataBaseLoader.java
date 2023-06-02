package academy.devdojo.maratonajava.javacore.M_interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
//    private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading Data Base...");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data Base...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Within retrieveMaxDataSize method from 'DataBaseLoader' interface.");
    }
}
