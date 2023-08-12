package academy.devdojo.maratonajava.javacore.Z_generics.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yolanda");
        list.add("Rodrigo");
        list.add("Rafinha");

        for (String name: list) {
            System.out.println(name);
        }
//        Displays and 'ClassCastException error'
//        add(list, new Consumer("Bonito"));

        for (String name: list) {
            System.out.println(name);
        }
    }

    public static void add(List list, Consumer consumer){
        list.add(consumer);
    }
}
