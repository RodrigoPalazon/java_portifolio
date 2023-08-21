package academy.devdojo.maratonajava.javacore.Z_generics.test;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Boat;
import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;
import academy.devdojo.maratonajava.javacore.Z_generics.service.ProfitableBoatService;
import academy.devdojo.maratonajava.javacore.Z_generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Mercedez")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Cruise"), new Boat("Yacht")));
        RentalService<Car> rentalService = new RentalService<>(availableCars);
        Car car = rentalService.searchAvailableObject();
        System.out.println("Using car for a month...");
        rentalService.returnRentedObject(car);
    }
}
