package academy.devdojo.maratonajava.javacore.O_exception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void salve() throws InvalidLoginException, FileNotFoundException{
        System.out.println("Salving Person...");
    }
}
