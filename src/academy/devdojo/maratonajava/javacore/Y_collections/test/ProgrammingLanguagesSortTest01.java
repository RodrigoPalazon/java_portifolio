package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProgrammingLanguagesByIdComparator implements Comparator<ProgrammingLanguage> {
    @Override
    public int compare(ProgrammingLanguage pl1, ProgrammingLanguage pl2) {
        return pl1.getId().compareTo(pl2.getId());
    }
}

public class ProgrammingLanguagesSortTest01 {
    public static void main(String[] args) {
        List<ProgrammingLanguage> programmingLanguages = new ArrayList<>(6);
        programmingLanguages.add(new ProgrammingLanguage(06L,"Java",18));
        programmingLanguages.add(new ProgrammingLanguage(02L,"JavaScript",6));
        programmingLanguages.add(new ProgrammingLanguage(07L,"Python", 3));
        programmingLanguages.add(new ProgrammingLanguage(01L,"Kotlin",1.1));
        programmingLanguages.add(new ProgrammingLanguage(03L,"C",0.01));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01));

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
        System.out.println("-----------");

        Collections.sort(programmingLanguages);

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }

        System.out.println("-----------");

        Collections.sort(programmingLanguages, new ProgrammingLanguagesByIdComparator());

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }

    }
}
