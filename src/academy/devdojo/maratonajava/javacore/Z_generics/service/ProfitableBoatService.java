package academy.devdojo.maratonajava.javacore.Z_generics.service;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class ProfitableBoatService {
     private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Cruise"), new Boat("Yacht")));

     public Boat searchAvailabeBoat() {
          System.out.println("Searching available boat...");
          Boat boat = availableBoats.remove(0);
          System.out.println("Renting boat: " + boat);
          System.out.println("Available boat for renting: " + availableBoats);
//          System.out.println(availableBoats);
          return boat;
     }

     public void returnRentedBoat(Boat boat){
          System.out.println("Returning boat: " + boat);
          availableBoats.add(boat);
          System.out.println("Boat available for renting");
          System.out.println(availableBoats);
     }
}
