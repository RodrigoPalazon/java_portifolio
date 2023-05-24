package academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average = 0;

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
            for (double salary : salaries) {
                average += salary;
            }
            average /= salaries.length;
            System.out.println("The average salary is $: " + average);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
