package academy.devdojo.maratonajava.javacore.N_polymorphism.service;

import academy.devdojo.maratonajava.javacore.N_polymorphism.repository.Repository;

public class DataBaseRepository implements Repository {
    @Override
    public void salve() {
        System.out.println("Salving in a DataBase ...");
    }
}
