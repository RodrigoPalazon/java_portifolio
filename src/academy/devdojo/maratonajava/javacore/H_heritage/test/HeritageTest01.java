package academy.devdojo.maratonajava.javacore.H_heritage.test;

import academy.devdojo.maratonajava.javacore.H_heritage.domain.Address;
import academy.devdojo.maratonajava.javacore.H_heritage.domain.Employee;
import academy.devdojo.maratonajava.javacore.H_heritage.domain.Person;

public class HeritageTest01 {
    public static void main(String[] args) {
        Address address_01 = new Address();
        address_01.setStreet("van Gogh street");
        address_01.setZipCode("02302-BA");

        Person person_01 = new Person();
        person_01.setName("Leonardo da Vinci");
        person_01.setCpf("321.456.852-98");
        person_01.setAddress(address_01);

        person_01.printData();

        Employee employee_01 = new Employee();
        employee_01.setName("Homer Simpson");
        employee_01.setCpf("444.555.666-77");
        employee_01.setAddress(address_01);
        employee_01.setSalary(2550);
        System.out.println("---------------");
        employee_01.printData();
    }
}
