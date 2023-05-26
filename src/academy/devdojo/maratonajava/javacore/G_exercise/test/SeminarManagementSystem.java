package academy.devdojo.maratonajava.javacore.G_exercise.test;

import academy.devdojo.maratonajava.javacore.G_exercise.domain.Location;
import academy.devdojo.maratonajava.javacore.G_exercise.domain.Seminar;
import academy.devdojo.maratonajava.javacore.G_exercise.domain.Student;
import academy.devdojo.maratonajava.javacore.G_exercise.domain.Teacher;

public class SeminarManagementSystem {
    public static void main(String[] args) {
        Location location = new Location("Den Haag");
        Student student_01 = new Student("Rodrigo", 35);
        Teacher teacher_01 = new Teacher("Anna Smith", "Java Engineer");

        Student[] registeredStudents = {};

        Seminar seminar_01 = new Seminar("Java Clean Code", registeredStudents, location);
        Seminar[] seminars = {seminar_01};

        teacher_01.setSeminars(seminars);

        teacher_01.printData();
    }
}
