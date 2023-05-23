package academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printEmployeeData() {
        System.out.println("--*-*-*- Employee -*-*-*-*-*--");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        averageSalary(this.salaries);
    }

    public void averageSalary(double[] salaries) {
        if (salaries == null) {
            return;
        } else {
            double average = 0;
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;
            System.out.println("The average salary is $: " + average);
        }
    }
}
