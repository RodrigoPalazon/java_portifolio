package academy.devdojo.maratonajava.javacore.M_interfaces.test;

import academy.devdojo.maratonajava.javacore.M_interfaces.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.M_interfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.M_interfaces.domain.FileLoader;

public class DataLoaderTester_01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
