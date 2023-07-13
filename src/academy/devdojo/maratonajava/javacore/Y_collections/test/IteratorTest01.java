package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<ProgrammingLanguage> programmingLanguages = new ArrayList<>(6);
        programmingLanguages.add(new ProgrammingLanguage(06L,"Java",18,0));
        programmingLanguages.add(new ProgrammingLanguage(02L,"JavaScript",6,2));
        programmingLanguages.add(new ProgrammingLanguage(07L,"Python", 3, 4));
        programmingLanguages.add(new ProgrammingLanguage(01L,"Kotlin",1.1, 0));
        programmingLanguages.add(new ProgrammingLanguage(03L,"C",0.01, 5));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01, 0));

//        Iterator<ProgrammingLanguage> languageIterator = programmingLanguages.iterator();
//         while(languageIterator.hasNext()){
//             ProgrammingLanguage pl = languageIterator.next();
//             if(pl.getQuantity() == 0){
//                 languageIterator.remove();
//             }
//         }

        programmingLanguages.removeIf(pl -> pl.getQuantity() == 0);
        System.out.println(programmingLanguages);
    }
}
