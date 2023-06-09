package academy.devdojo.maratonajava.javacore.Q_string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name_01 = "Rodrigo"; //String constant pool
        String name_02 = "Rodrigo";

        System.out.println(name_01.concat(" Palazon"));
        System.out.println(name_01 == name_02);
        System.out.println("------------");

        name_01 = name_01.concat(" Palazon");
        System.out.println(name_01);
        System.out.println(name_01 == name_02);
        System.out.println("------------");

        String name_03 = "Rodrigo";
        System.out.println("Same memory " + name_01 == name_03);
    }
}
