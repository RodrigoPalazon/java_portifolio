package academy.devdojo.maratonajava.javacore.H_inheritance.domain;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void printData() {
        super.printData();
        System.out.println("Salary: " + this.salary);
    }

    public void paymentReport(){
        System.out.println("I, " + this.getName() + " received the salary of " + this.salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
