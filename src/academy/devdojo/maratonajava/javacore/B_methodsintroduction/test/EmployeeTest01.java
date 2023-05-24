package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee_01 = new Employee();
        Employee employee_02 = new Employee();

        employee_01.setName("Brian");
        employee_01.setAge(25);
//        Creating error by purpose
//        employee_01.salaries = new double[]{1000, 2000, 3000};

        employee_02.setName("Rebecca");
        employee_02.setAge(31);
        employee_02.setSalaries(new double[]{1000, 2000, 3000});

        employee_01.printEmployeeData();
        employee_02.printEmployeeData();
    }
}
