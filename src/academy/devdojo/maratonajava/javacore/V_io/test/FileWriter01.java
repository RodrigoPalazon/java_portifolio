package academy.devdojo.maratonajava.javacore.V_io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw= new FileWriter(file,true)) {
            fw.write("The DevDojo is the best brazilian Java course.\n This goes in the second line of the text.");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
