package academy.devdojo.maratonajava.javacore.H_inheritance.test;

import academy.devdojo.maratonajava.javacore.H_inheritance.domain.Employee;

public class InheritanceTest02 {
    //    Order of compiling
//      0- Initialization Static Block from super Class, is executed when the JVM loads that.
//      1- Initialization Static Block from subclass, is executed when the JVM loads that.
//      2- Allocate memory space for super Class object.
//      3- Each class attribute from super class is created and initialized with default or set values.
//      4- Initialization block from super class is executed in the set order.
//      5- Constructor of super class is executed.
//        for sub class...
//      7- Allocate memory space for object of subclass.
//      8- Each class attribute from subclass is created and initialized with default or set values.
//      4- Initialization block from subclass is executed in the set order.
//      5- Constructor of subclass is executed.
    public static void main(String[] args) {
        Employee employee = new Employee("Rebecca Anthony");
    }
}
