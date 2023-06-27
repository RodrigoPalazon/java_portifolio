package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path_01 = Paths.get("/home/rodrigo-palazon/Documents/backend/Java/java_fundamentals/file.txt");
        Path path_02 = Paths.get("/home/rodrigo-palazon/Documents/backend/Java/java_fundamentals","file.txt");
        Path path_03 = Paths.get("/home","rodrigo-palazon/Documents/backend/Java/java_fundamentals", "file.txt");
        Path path_04 = Paths.get("/home/", "rodrigo-palazon","Documents","backend","Java", "java_fundamentals", "file.txt");
        System.out.println(path_01.getFileName());
        System.out.println(path_02.getFileName());
        System.out.println(path_03.getFileName());
        System.out.println(path_04.getFileName());
    }
}
