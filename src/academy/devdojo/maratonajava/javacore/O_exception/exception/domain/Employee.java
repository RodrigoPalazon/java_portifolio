package academy.devdojo.maratonajava.javacore.O_exception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{
    public void salve() throws InvalidLoginException{
        System.out.println("Salving Employee");
    }
}
