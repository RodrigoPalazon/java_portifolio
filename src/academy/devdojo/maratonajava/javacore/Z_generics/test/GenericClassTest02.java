package academy.devdojo.maratonajava.javacore.Z_generics.test;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Boat;
import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;
import academy.devdojo.maratonajava.javacore.Z_generics.service.ProfitableBoatService;
import academy.devdojo.maratonajava.javacore.Z_generics.service.ProfitableCarService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        ProfitableBoatService profitableBoatService = new ProfitableBoatService();
        Boat boat = profitableBoatService.searchAvailabeBoat();
        System.out.println("Using boat for a month...");
        profitableBoatService.returnRentedBoat(boat);
    }
}
