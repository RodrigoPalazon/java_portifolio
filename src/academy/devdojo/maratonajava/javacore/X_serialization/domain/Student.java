package academy.devdojo.maratonajava.javacore.X_serialization.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 8231191580560378086L;
    private Long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "DevDojo - Java Marathon";

    private transient Buddies buddies;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(buddies.getName());
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nameBuddies = ois.readUTF();
            buddies = new Buddies(nameBuddies);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", Buddies='" + buddies + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Buddies getBuddies() {
        return buddies;
    }

    public void setBuddies(Buddies buddies) {
        this.buddies = buddies;
    }
}
