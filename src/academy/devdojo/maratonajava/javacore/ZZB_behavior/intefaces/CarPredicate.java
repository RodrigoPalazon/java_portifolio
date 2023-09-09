package academy.devdojo.maratonajava.javacore.ZZB_behavior.intefaces;

import academy.devdojo.maratonajava.javacore.ZZB_behavior.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
