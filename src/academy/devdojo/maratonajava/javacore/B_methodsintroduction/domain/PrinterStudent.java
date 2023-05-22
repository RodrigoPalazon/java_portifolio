package academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain;

public class PrinterStudent {
    public void printerMethod(Student student) {
        System.out.println("--*-*-*-*-*-*-*-*--");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
