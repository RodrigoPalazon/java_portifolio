package academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void printerStudent() {
        System.out.println("--------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
