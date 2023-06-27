package academy.devdojo.maratonajava.javacore.V_io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Is directory created? " + isDirectoryCreated);
        File fileFolderDirectory = new File(fileDirectory, "file.txt");
        boolean isFileCreated = fileFolderDirectory.createNewFile();
        System.out.println("Is fie created? " + isFileCreated);
        File fileRenamed = new File(fileDirectory,"file_renamed.txt");
        boolean isRenamed = fileFolderDirectory.renameTo(fileRenamed);
        System.out.println("Is file renamed? " + isRenamed);

        File directoryRenamed = new File("file_02");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Is directory renamed? " + isDirectoryRenamed);
    }
}
