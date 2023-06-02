package academy.devdojo.maratonajava.javacore.L_abstractClasses.domain;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calcBonus();
    }

    public abstract void calcBonus();

    @Override
    public void printData() {
        System.out.println("Printing ...");
    }
}
