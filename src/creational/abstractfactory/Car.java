package creational.abstractfactory;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }
}
