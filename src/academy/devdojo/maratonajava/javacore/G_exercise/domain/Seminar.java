package academy.devdojo.maratonajava.javacore.G_exercise.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Location location;

    public Seminar(String title, Location location) {
        this.title = title;
        this.location = location;
    }

    public Seminar(String title, Student[] students, Location location) {
        this.title = title;
        this.students = students;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
