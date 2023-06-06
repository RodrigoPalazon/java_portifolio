package academy.devdojo.maratonajava.javacore.O_exception.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
//      Stack overflow error purposely created.
        recursivity();
    }

    public static void recursivity() {
        recursivity();
    }
}
