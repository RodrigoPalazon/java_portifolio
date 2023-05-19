package academy.devdojo.maratonajava.javacore.A_classesintroduction.test;

import academy.devdojo.maratonajava.javacore.A_classesintroduction.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student_01 = new Student();
        Student student_02 = new Student();

        student_01.name = "Bonito";
        student_01.age = 28;
        student_01.gender = 'M';

        student_02.name = "Yolanda";
        student_02.age = 35;
        student_02.gender = 'F';

        System.out.println(student_01.name);
        System.out.println(student_01.age);
        System.out.println(student_01.gender);

        System.out.println("------------");

        System.out.println(student_02.name);
        System.out.println(student_02.age);
        System.out.println(student_02.gender);
    }
}
