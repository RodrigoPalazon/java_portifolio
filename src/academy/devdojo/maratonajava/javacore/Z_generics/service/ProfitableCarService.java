package academy.devdojo.maratonajava.javacore.Z_generics.service;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCarService {
     private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Mercedez")));

     public Car searchAvailabeCar() {
          System.out.println("Searching available car...");
          Car car = availableCars.remove(0);
          System.out.println("Renting car: " + car);
          System.out.println("Available car for renting: " + availableCars);
//          System.out.println(availableCars);
          return car;
     }

     public void returnRentedCar(Car car){
          System.out.println("Returning car: " + car);
          availableCars.add(car);
          System.out.println("Car available for renting");
          System.out.println(availableCars);
     }
}
