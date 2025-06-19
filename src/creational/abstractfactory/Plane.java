package creational.abstractfactory;

public class Plane extends Vehicle {
    @Override
    public void move() {
        System.out.println("Plane is flying.");
    }
}
