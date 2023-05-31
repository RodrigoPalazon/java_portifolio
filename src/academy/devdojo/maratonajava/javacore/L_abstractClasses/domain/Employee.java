package academy.devdojo.maratonajava.javacore.L_abstractClasses.domain;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
