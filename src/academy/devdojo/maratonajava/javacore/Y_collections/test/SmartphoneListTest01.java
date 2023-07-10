package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone_01 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone_02 = new Smartphone("2222", "Pixel");
        Smartphone smartphone_03 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone_01);
        smartphones.add(smartphone_02);
        smartphones.add(0,smartphone_03);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone smartphone_04 = new Smartphone("33333", "Samsung");
        System.out.println(smartphones.contains(smartphone_04));
        int indexSmartphone_04 = smartphones.indexOf(smartphone_04);
        System.out.println(indexSmartphone_04);
        System.out.println("Mobile Selected: " + smartphones.get(indexSmartphone_04));
    }
}
