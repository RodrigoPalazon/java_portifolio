package academy.devdojo.maratonajava.javacore.O_exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.Reader01;
import academy.devdojo.maratonajava.javacore.O_exception.exception.domain.Reader02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile(){
         try(Reader01 reader_01 = new Reader01();
             Reader02 reader_02 = new Reader02()){

         }catch (IOException e){

         }
    }

    private static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
