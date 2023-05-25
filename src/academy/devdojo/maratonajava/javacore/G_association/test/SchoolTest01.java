package academy.devdojo.maratonajava.javacore.G_association.test;

import academy.devdojo.maratonajava.javacore.G_association.domain.School;
import academy.devdojo.maratonajava.javacore.G_association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher_01 = new Teacher("Tony Williams");
        Teacher teacher_02 = new Teacher("Vinnie Colaiuta");
        Teacher teacher_03 = new Teacher("Gary Novak");
        Teacher[] teachers = {teacher_01, teacher_02, teacher_03};
        School school = new School("Willem Basis School",teachers);

        school.printData();
    }
}
