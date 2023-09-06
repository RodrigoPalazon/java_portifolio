package academy.devdojo.maratonajava.javacore.ZZB_behavior.test;

import academy.devdojo.maratonajava.javacore.ZZB_behavior.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZB_behavior.intefaces.CarPredicate;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest03 {
    private static List<Car> cars = List.of(new Car("green", 2024), new Car("red", 1997), new Car("white", 2005));

    public static void main(String[] args) {


        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
