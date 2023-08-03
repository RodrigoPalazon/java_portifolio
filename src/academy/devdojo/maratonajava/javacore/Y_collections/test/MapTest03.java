package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer_01 = new Consumer("Rodrigo Palazon");
        Consumer consumer_02 = new Consumer("DevDojo Academy");

        ProgrammingLanguage language_01 = new ProgrammingLanguage(06L, "Java", 18);
        ProgrammingLanguage language_02 =new ProgrammingLanguage(02L,"JavaScript",6);
        ProgrammingLanguage language_03 =new ProgrammingLanguage(07L,"Python", 3);
        ProgrammingLanguage language_04 =new ProgrammingLanguage(01L,"Kotlin",1.1);
        ProgrammingLanguage language_05 =new ProgrammingLanguage(03L,"C",0.01);
        ProgrammingLanguage language_06 =new ProgrammingLanguage(04L,"Go", 7.01);

        List<ProgrammingLanguage> programmingLanguagesList_01 = List.of(language_01, language_02, language_03);
        List<ProgrammingLanguage> programmingLanguagesList_02 = List.of(language_03, language_04);
        Map<Consumer, List<ProgrammingLanguage>> consumerProgrammingLanguageMap = new HashMap<>();
        consumerProgrammingLanguageMap.put(consumer_01, programmingLanguagesList_01);
        consumerProgrammingLanguageMap.put(consumer_02, programmingLanguagesList_02);

        for (Map.Entry<Consumer, List<ProgrammingLanguage>> entry : consumerProgrammingLanguageMap.entrySet()) {
            System.out.println("---------" + entry.getKey().getName());
            for (ProgrammingLanguage language : entry.getValue()) {
                System.out.println("----------------" + language.getName());
            }

        }

    }
}
