package academy.devdojo.maratonajava.javacore.A_classesintroduction.test;

import academy.devdojo.maratonajava.javacore.A_classesintroduction.domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Yuval Harari";
        teacher.age = 48;
        teacher.gender = 'M';

        System.out.println("Name: " + teacher.name + "; " + "Age: " + teacher.age + "; " + "Gender: " +teacher.gender);
    }
}
