package academy.devdojo.maratonajava.javacore.Z_generics.test;

abstract class Animal{
    public abstract void appointment();
}

class Dog extends Animal{
    @Override
    public void appointment() {
        System.out.println("Checking Dog");
    }
}

class Cat extends Animal{
    @Override
    public void appointment() {
        System.out.println("Checking Cat");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

        System.out.print("Dogs: ");
        printAppointment(dogs);
        System.out.print("Cats:");
        printAppointment(cats);

        Animal[] animals = {new Cat(), new Dog()};
        System.out.println("Animals: ");
        printAppointment(animals);
    }

    private static void printAppointment(Animal[] animals){
        for (Animal animal: animals) {
            animal.appointment();
        }
//        animals[1] = new Cat();
    }
}
