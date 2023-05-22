package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Calculator calculator = new Calculator();

        calculator.replaceTwoNumbers(a, b);

        System.out.println("From CalculatorTest04 file");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}
