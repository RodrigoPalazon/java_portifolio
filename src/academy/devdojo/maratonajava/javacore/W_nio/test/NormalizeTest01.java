package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectDirectory = "home/rodrigo/dev";
        String txtFile = "../../file.txt";
        Path path_01 = Paths.get(projectDirectory, txtFile);
        Path path_02 = Paths.get("/home/./rodrigo/./dev");
        System.out.println(path_01);
        System.out.println(path_01.normalize());
        System.out.println(path_02);
        System.out.println(path_02.normalize());
    }
}
