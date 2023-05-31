package academy.devdojo.maratonajava.javacore.L_abstractClasses.test;

import academy.devdojo.maratonajava.javacore.L_abstractClasses.domain.Developer;
import academy.devdojo.maratonajava.javacore.L_abstractClasses.domain.Employee;
import academy.devdojo.maratonajava.javacore.L_abstractClasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager_01 = new Manager("Juan", 6000);
        System.out.println(manager_01);

        Developer developer_01 = new Developer("Rodrigo", 4000);
        System.out.println(developer_01);
    }
}
