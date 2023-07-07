package academy.devdojo.maratonajava.javacore.Y_collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        names.add("Rodrigo");
        names.add("Palazon");

        for (String name:names) {
            System.out.println(name);
        }

        names.add("Yolanda");
        System.out.println("-----------------");

        for (int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println(names);
    }
}
