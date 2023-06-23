package academy.devdojo.maratonajava.javacore.U_regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa";
        String[] names = text.split(",");
        for(String name:names){
            System.out.println(name.trim());
        }
    }
}
