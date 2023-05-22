package academy.devdojo.maratonajava.javacore.B_methodsintroduction.test;

import academy.devdojo.maratonajava.javacore.B_methodsintroduction.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student_01 = new Student();
        Student student_02 = new Student();

        student_01.name = "Yolanda";
        student_01.age = 35;
        student_01.gender = 'F';

        student_02.name = "Rafael";
        student_02.age = 01;
        student_02.gender = 'M';

        student_01.printerStudent();
        student_02.printerStudent();
    }
}
