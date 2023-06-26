package academy.devdojo.maratonajava.javacore.V_io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
//            System.out.println("Is last modified: " + file.lastModified()); //milliseconds
//            System.out.println("Is last modified: " + new Date(file.lastModified())); // date
            System.out.println("Is last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // date modern way
            boolean exists = file.exists();
            if(exists){
                boolean isDeleted = file.delete();
                System.out.println("Deleted: " + isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
