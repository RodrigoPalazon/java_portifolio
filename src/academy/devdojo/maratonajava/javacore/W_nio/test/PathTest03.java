package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/rodrigo");
        Path file = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path absolute = Paths.get("/home/rodrigo");
        Path relative = Paths.get("dev");
        Path file_02 = Paths.get("file.txt");
        System.out.println("1: " + absolute.resolve(relative));
        System.out.println("2: " + absolute.resolve(file_02));
        System.out.println("3: " + relative.resolve(absolute));
        System.out.println("4: " + relative.resolve(file_02));
        System.out.println("5: " + file_02.resolve(absolute));
        System.out.println("6: " + file_02.resolve(relative));
    }
}
