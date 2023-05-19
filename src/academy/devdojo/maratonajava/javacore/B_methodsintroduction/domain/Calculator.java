package academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subTwoNumbers() {
        System.out.println(20 - 10);
    }

    public void multiplyTwoNumbers(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers (double num1, double num2) {
        return num1 / num2;
    }
}
