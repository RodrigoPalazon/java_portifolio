package academy.devdojo.maratonajava.javacore.ZZA_innerClasses.test;

public class OuterClassesTest02 {
    private String name = "Rodrigo";

    void print(final String param){
        final String lastName = "Palazon";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print();
    }
}
