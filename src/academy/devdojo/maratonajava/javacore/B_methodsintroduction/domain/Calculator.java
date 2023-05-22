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

    public  void replaceTwoNumbers (int num1, int num2) {
        num1 = 99;
        num2 = 23;

        System.out.println("Result from the method");
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

//    VarArgs Parameters
    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
