package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.PrinterStudent;
import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student_01 = new Student();
        Student student_02 = new Student();
        PrinterStudent print = new PrinterStudent();

        student_01.name = "Rodrigo";
        student_01.age = 35;
        student_01.gender = 'M';

        student_02.name = "Bonito";
        student_02.age = 23;
        student_02.gender = 'M';

        print.printerMethod(student_01);
        print.printerMethod(student_02);
    }
}
