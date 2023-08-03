package academy.devdojo.maratonajava.javacore.Y_collections.test;

import academy.devdojo.maratonajava.javacore.Y_collections.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Y_collections.domain.ProgrammingLanguage;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
//        Consumer consumer = new Consumer("Rodrigo Palazon");
        Queue<ProgrammingLanguage> programmingLanguages = new PriorityQueue<>(new ProgrammingLanguageVersionComparator().reversed());
        programmingLanguages.add(new ProgrammingLanguage(06L,"Java",18));
        programmingLanguages.add(new ProgrammingLanguage(02L,"JavaScript",6));
        programmingLanguages.add(new ProgrammingLanguage(07L,"Python", 3));
        programmingLanguages.add(new ProgrammingLanguage(01L,"Kotlin",1.1));
        programmingLanguages.add(new ProgrammingLanguage(03L,"C",0.01));
        programmingLanguages.add(new ProgrammingLanguage(04L,"Go", 7.01));

        while(!programmingLanguages.isEmpty()){
            System.out.println(programmingLanguages.poll());
        }
    }
}
