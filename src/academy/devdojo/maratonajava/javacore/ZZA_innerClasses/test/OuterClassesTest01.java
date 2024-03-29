package academy.devdojo.maratonajava.javacore.ZZA_innerClasses.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";
    // Nested Classes
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //Inner class
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
