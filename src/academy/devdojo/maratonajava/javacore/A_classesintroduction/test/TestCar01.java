package academy.devdojo.maratonajava.javacore.A_classesintroduction.test;

import academy.devdojo.maratonajava.javacore.A_classesintroduction.domain.Car;

public class TestCar01 {
    public static void main(String[] args) {
        Car car_01 = new Car();
        Car car_02 = new Car();

        car_01.brand = "Toyota";
        car_01.model = "Corolla";
        car_01.year = 2020;

        car_02.brand = "Volvo";
        car_02.model = "XC90";
        car_02.year = 2023;

        System.out.println("brand: " + car_01.brand + "; " + "model: " + car_01.model + "; " + "year: " + car_01.year + ";");
        System.out.println("brand: " + car_02.brand + "; " + "model: " + car_02.model + "; " + "y ear: " + car_02.year+ ";");
    }
}
