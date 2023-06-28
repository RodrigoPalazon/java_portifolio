package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/rodrigo");
        Path fullPath = Paths.get("/home/rodrigo/devdojo/HelloWorld.java");
        Path completingFullPath = dir.relativize(fullPath);
        System.out.println(completingFullPath);

        Path absolute_01 = Paths.get("/home/rodrigo");
        Path absolute_02 = Paths.get("/usr/local");
        Path absolute_03 = Paths.get("/home/rodrigo/devdojo/HelloWorld.java");
        Path relative_01 = Paths.get("temp");
        Path relative_02 = Paths.get("temp/temp.202123525");

        System.out.println("1: " + absolute_01.relativize(absolute_03));
        System.out.println("2: " + absolute_03.relativize(absolute_01));
        System.out.println("3: " + absolute_01.relativize(absolute_02));
        System.out.println("4: " + relative_01.relativize(relative_02));
//        System.out.println("5: " + absolute_01.relativize(relative_01));// throws exception
    }
}
