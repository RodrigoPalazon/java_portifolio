package academy.devdojo.maratonajava.javacore.ZZA_innerClasses.test;

public class OuterClassesTest03 {
    private String name = "Rodrigo";

    static class Nested{
        private String lastName = "Palazon";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested);
    }
}
