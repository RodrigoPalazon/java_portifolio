package academy.devdojo.maratonajava.javacore.J_finalModifier.test;

import academy.devdojo.maratonajava.javacore.J_finalModifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.J_finalModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setName("Brian");
        System.out.println(car.BUYER);
    }
}
