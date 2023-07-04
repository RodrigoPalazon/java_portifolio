package academy.devdojo.maratonajava.javacore.X_serialization.test;

import academy.devdojo.maratonajava.javacore.X_serialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {

    public static void main(String[] args) {
        Student student_01 = new Student(1L, "Rodrigo Palazon", "123321123321");
//        serializer(student_01);
        deserializer();
    }

    private static void serializer(Student student){
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializer(){
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
