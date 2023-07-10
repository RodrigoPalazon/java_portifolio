package academy.devdojo.maratonajava.javacore.Y_collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> programLanguages = new ArrayList<>(6);
        programLanguages.add("Java");
        programLanguages.add("JavaScript");
        programLanguages.add("Python");
        programLanguages.add("Kotlin");
        programLanguages.add("C");
        programLanguages.add("Go");

        Collections.sort(programLanguages);

        for (String programLanguage : programLanguages) {
            System.out.println(programLanguage);
        }
    }
}
