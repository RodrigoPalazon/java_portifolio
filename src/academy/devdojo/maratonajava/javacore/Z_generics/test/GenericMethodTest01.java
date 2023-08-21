package academy.devdojo.maratonajava.javacore.Z_generics.test;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Boat;
import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithAnObject(new Boat("Canoe"));
        System.out.println(boatList);
    }

    private static <T> List<T> createArrayWithAnObject(T t) {
        List<T> list = List.of(t);
        return list;
    }
}
