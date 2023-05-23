package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee_01 = new Employee();
        Employee employee_02 = new Employee();

        employee_01.name = "Brian";
        employee_01.age = 25;
//        Creating error by purpose
//        employee_01.salaries = new double[]{1000, 2000, 3000};

        employee_02.name = "Rebecca";
        employee_02.age = 31;
        employee_02.salaries = new double[]{1000, 2000, 3000};

        employee_01.printEmployeeData();
        employee_02.printEmployeeData();
    }
}
