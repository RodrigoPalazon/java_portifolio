package academy.devdojo.maratonajava.javacore.Q_string.test;

public class  StringBuilderTest01 {
    public static void main(String[] args) {
         String name = "Rodrigo Palazon";
         name.concat(" - Java Dev.");
         StringBuilder sb = new StringBuilder("Rodrigo Palazon");
         sb.append(" - Java Dev.");
         sb.reverse();
         sb.reverse();
         sb.delete(0,3);
         System.out.println(sb);
    }
}
