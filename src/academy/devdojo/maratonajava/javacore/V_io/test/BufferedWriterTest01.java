package academy.devdojo.maratonajava.javacore.V_io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw= new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw);) {
            br.write("The DevDojo is the best brazilian Java course. This goes in the second line of the text.");
            br.newLine();
            br .flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
