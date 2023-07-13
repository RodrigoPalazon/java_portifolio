package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<ProgrammingLanguage> programmingLanguages = new LinkedHashSet<>();
        programmingLanguages.add(new ProgrammingLanguage(06L,"Java",18));
        programmingLanguages.add(new ProgrammingLanguage(02L,"JavaScript",6));
        programmingLanguages.add(new ProgrammingLanguage(07L,"Python", 3));
        programmingLanguages.add(new ProgrammingLanguage(01L,"Kotlin",1.1));
        programmingLanguages.add(new ProgrammingLanguage(03L,"C",0.01));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01));

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }

    }
}
