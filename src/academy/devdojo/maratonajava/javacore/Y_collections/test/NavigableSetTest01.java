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
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<ProgrammingLanguage> programmingLanguages = new TreeSet<>();
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
