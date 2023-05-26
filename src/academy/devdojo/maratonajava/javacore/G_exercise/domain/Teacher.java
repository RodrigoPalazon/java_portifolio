package academy.devdojo.maratonajava.javacore.G_exercise.domain;

public class Teacher {
    private String name;
    private String speciality;
    private Seminar[] seminars;


    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Teacher(String name, String speciality, Seminar[] seminars) {
        this.name = name;
        this.speciality = speciality;
        this.seminars = seminars;
    }

    public void printData() {
        System.out.println("---------");
        System.out.println("Teacher: " + this.name);
        if (this.seminars == null) return;
        System.out.println("### Seminars ###");
        for (Seminar seminar : this.seminars) {
            System.out.println("Seminars: " + seminar.getTitle());
            System.out.println("Location: " + seminar.getLocation().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
            System.out.println("--- Students --- ");
            for (Student student : seminar.getStudents()) {
                System.out.println("Name: " + student.getName() + ", age: " + student.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
