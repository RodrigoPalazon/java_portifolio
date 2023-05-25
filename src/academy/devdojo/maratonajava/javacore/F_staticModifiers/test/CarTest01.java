package academy.devdojo.maratonajava.javacore.F_staticModifiers.test;

import academy.devdojo.maratonajava.javacore.F_staticModifiers.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setFabricLimitSpeed(111);

        Car car_01 = new Car("BMW", 280);
        Car car_02 = new Car("Audi", 310);
        Car car_03 = new Car("Porsche", 320);

        System.out.println("setFabricLimitSpeed: " + Car.getFabricLimitSpeed());

        car_01.printData();
        car_02.printData();
        car_03.printData();
    }
}
