package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s_01 = new Smartphone("1ABC!", "iPhone");
        Smartphone s_02 = new Smartphone("1ABC!", "iPhone"); // returns false
//        Smartphone s_02 = s_01; // returns true


        System.out.println(s_01.equals(s_02));
    }
}
