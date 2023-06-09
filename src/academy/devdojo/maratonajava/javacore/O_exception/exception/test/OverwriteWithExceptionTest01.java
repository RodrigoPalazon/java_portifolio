package academy.devdojo.maratonajava.javacore.O_exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverwriteWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            person.salve();
        } catch (InvalidLoginException | FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            employee.salve();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
