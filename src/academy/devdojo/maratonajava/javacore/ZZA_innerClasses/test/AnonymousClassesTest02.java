package academy.devdojo.maratonajava.javacore.ZZA_innerClasses.test;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Boat;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Boat>{

    @Override
    public int compare(Boat o1, Boat o2) {
         return o1.getName().compareTo(o2.getName());
    }
}
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Yacht"), new Boat("Cruise")));
        boatList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(boatList);
    }
}
