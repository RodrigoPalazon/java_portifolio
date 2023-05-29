package academy.devdojo.maratonajava.javacore.J_finalModifier.test;

import academy.devdojo.maratonajava.javacore.J_finalModifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.J_finalModifier.domain.Car;
import academy.devdojo.maratonajava.javacore.J_finalModifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setName("Brian");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Bob");
        ferrari.printData();
    }
}
