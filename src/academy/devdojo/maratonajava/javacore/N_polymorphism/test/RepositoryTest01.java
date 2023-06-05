package academy.devdojo.maratonajava.javacore.N_polymorphism.test;

import academy.devdojo.maratonajava.javacore.N_polymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.N_polymorphism.service.DataBaseRepository;
import academy.devdojo.maratonajava.javacore.N_polymorphism.service.FileRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        repository.salve();

//        List<String> list= new LinkedList<>();
//        list.add("Rodrigo");
//        list.add("Yolanda");
//        list.add("Rafael");
//        list.add("Bonito");
//
//        System.out.println(list);

    }
}
