package academy.devdojo.maratonajava.javacore.Z_generics.service;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T searchAvailableObject() {
        System.out.println("Searching available object...");
        T t = availableObjects.remove(0);
        System.out.println("Renting object: " + t);
        System.out.println("Available object for renting: " + availableObjects);
//          System.out.println(availableCars);
        return t;
    }

    public void returnRentedObject(T t){
        System.out.println("Returning object: " + t);
        availableObjects.add(t);
        System.out.println("Object available for renting");
        System.out.println(availableObjects);
    }
}
