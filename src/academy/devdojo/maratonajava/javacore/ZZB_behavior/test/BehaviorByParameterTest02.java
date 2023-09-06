package academy.devdojo.maratonajava.javacore.ZZB_behavior.test;

import academy.devdojo.maratonajava.javacore.ZZB_behavior.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZB_behavior.intefaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest02 {
    private static List<Car> cars = List.of(new Car("green", 2024),new Car("red", 1997),new Car("white", 2005));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);
    }

    
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
