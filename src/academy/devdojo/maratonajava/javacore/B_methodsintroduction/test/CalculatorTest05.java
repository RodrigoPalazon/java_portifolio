package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int[] numbers = {1, 2, 3, 4, 5};

        calculator.sumArray(numbers);
        calculator.sumVarArgs(1, 2, 3, 4, 5);
    }
}
