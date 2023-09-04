package academy.devdojo.maratonajava.javacore.ZZB_behavior.test;

import academy.devdojo.maratonajava.javacore.ZZB_behavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest01 {
    private static List<Car> cars = List.of(new Car("green", 2024),new Car("red", 1997),new Car("white", 2005));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("----------");
        System.out.println(filterCarYear(cars, 2007));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equals("red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equals(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarYear(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
