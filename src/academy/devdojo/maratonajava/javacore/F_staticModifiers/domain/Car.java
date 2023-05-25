package academy.devdojo.maratonajava.javacore.F_staticModifiers.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double fabricLimitSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printData() {
        System.out.println("-----------");
        System.out.println("Name: " + this.name);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Limit speed: " + Car.fabricLimitSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getFabricLimitSpeed() {
        return Car.fabricLimitSpeed;
    }

    public static void setFabricLimitSpeed(double fabricLimitSpeed) {
        Car.fabricLimitSpeed = fabricLimitSpeed;
    }
}
