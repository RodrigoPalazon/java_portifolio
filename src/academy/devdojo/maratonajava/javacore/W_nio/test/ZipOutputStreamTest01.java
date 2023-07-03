package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("folder/file.zip");
        Path filesToZip = Paths.get("folder/subfolder_01/susubfolder_01");
        zip(fileZip, filesToZip);
    }

    private static void zip(Path fileZip, Path filesToZip) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesToZip)){
            for(Path file:directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("File successfully created");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
