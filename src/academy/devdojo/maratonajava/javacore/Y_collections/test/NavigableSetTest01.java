package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;
import academy.devdojo.maratonajava.javacore.Y_collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmarthphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class ProgrammingLanguageVersionComparator implements Comparator<ProgrammingLanguage> {
    @Override
    public int compare(ProgrammingLanguage o1, ProgrammingLanguage o2) {
        return Double.compare(o1.getVersion(), o2.getVersion());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<ProgrammingLanguage> programmingLanguages = new TreeSet<>(new ProgrammingLanguageVersionComparator());
        programmingLanguages.add(new ProgrammingLanguage(06L,"Java",18,0));
        programmingLanguages.add(new ProgrammingLanguage(02L,"JavaScript",6, 2));
        programmingLanguages.add(new ProgrammingLanguage(07L,"Python", 3, 4));
        programmingLanguages.add(new ProgrammingLanguage(01L,"Kotlin",1.1, 5));
        programmingLanguages.add(new ProgrammingLanguage(03L,"C",0.01, 2));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01, 32));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01, 7));

        for (ProgrammingLanguage programmingLanguage : programmingLanguages.descendingSet()) {
            System.out.println(programmingLanguage);
        }

        //lower <
        //floor <=
        //higher >
        //ceiling >=
    }
}
