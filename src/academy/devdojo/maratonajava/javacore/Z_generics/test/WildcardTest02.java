package academy.devdojo.maratonajava.javacore.Z_generics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
    }

//    Type erasure error
    private static void printAppointment(List<Animal> animals){
        for (Animal animal: animals) {
            animal.appointment();
        }
        animals.add(new Dog());
    }
}
