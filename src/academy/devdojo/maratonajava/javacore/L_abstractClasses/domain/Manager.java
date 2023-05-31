package academy.devdojo.maratonajava.javacore.L_abstractClasses.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calcBonus() {
        this.salary = salary + (salary * 0.2);
    }
}
