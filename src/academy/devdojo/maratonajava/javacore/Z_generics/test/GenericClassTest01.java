package academy.devdojo.maratonajava.javacore.Z_generics.test;

import academy.devdojo.maratonajava.javacore.Z_generics.domain.Car;
import academy.devdojo.maratonajava.javacore.Z_generics.service.ProfitableCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCarService profitableCarService = new ProfitableCarService();
        Car car = profitableCarService.searchAvailabeCar();
        System.out.println("Using car for a month...");
        profitableCarService.returnRentedCar(car);
    }
}
