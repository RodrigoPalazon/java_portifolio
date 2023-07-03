package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path_01 = Paths.get("folder/subfolder/file.bkp");
        Path path_02 = Paths.get("folder/subfolder/file.txt");
        Path path_03 = Paths.get("folder/subfolder/file.java");

        matches(path_01,"glob:*.bkp");
        matches(path_01,"glob:**/*.bkp");
        matches(path_01,"glob:**/*.{bkp,txt,java}");
        matches(path_02,"glob:**/*.{bkp,txt,java}");
        matches(path_03,"glob:**/*.{bkp,txt,java}");
        matches(path_01,"glob:**/*.???");
        matches(path_02,"glob:**/*.???");
        matches(path_03,"glob:**/*.???");
        matches(path_03,"glob:**/file.???");
    }

    private static void matches(Path path,String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
