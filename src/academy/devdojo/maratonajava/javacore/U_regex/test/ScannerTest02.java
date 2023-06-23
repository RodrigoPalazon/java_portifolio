package academy.devdojo.maratonajava.javacore.U_regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            }else{
                System.out.println("String: " + scanner.next());
            }
        }
    }
}
