package academy.devdojo.maratonajava.javacore.A_classesintroduction.test;


import academy.devdojo.maratonajava.javacore.A_classesintroduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Rodrigo";
        student.age = 35;
        student.gender = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
