package academy.devdojo.maratonajava.javacore.Y_collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names_01 = new ArrayList<>(16);
        List<String> names_02 = new ArrayList<>(16);
        names_01.add("Rodrigo");
        names_01.add("Palazon");
        names_01.remove("Palazon");
        names_02.add("Yolanda");
        names_02.add("Abravanel");

        names_01.addAll(names_02);

        for (String name:names_01) {
            System.out.println(name);
        }

        names_01.add("Yolanda");
        System.out.println("-----------------");

        int size = names_01.size();
        for (int i=0; i < size; i++){
            System.out.println(names_01.get(i));
        }

        System.out.println(names_01);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);

        System.out.println(numbers);
    }
}
