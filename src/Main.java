import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Vehicle;
import creational.abstractfactory.VehicleFactory;
import creational.builder.*;
import creational.factory.ShapeFactory;
import creational.prototype.Author;
import creational.prototype.Book;
import creational.singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {
        // Singleton
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = SingletonExample.getInstance();
        instance1.sayHello();

        if (instance1 == instance2) {
            System.out.println("Same instance!");
        }
        System.out.println();

        // Factory
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("triangle").draw();
        shapeFactory.getShape("rectangle").draw();
        System.out.println();

        // Abstract Factory
        AbstractFactory abstractFactory = new AbstractFactory();
        VehicleFactory factory1 = abstractFactory.getVehicleFactory("air");
        Vehicle v1 = factory1.getVehicle("helicopter");
        v1.move();
        Vehicle v2 = factory1.getVehicle("plane");
        v2.move();
        VehicleFactory factory2 = abstractFactory.getVehicleFactory("land");
        Vehicle v3 = factory2.getVehicle("car");
        v3.move();
        Vehicle v4 = factory2.getVehicle("truck");
        v4.move();
        System.out.println();

        // Builder
        AnimalBuilder builder1 = new DogBuilder();
        Owner owner = new Owner(builder1);
        owner.constructAnimal();
        Animal animal = owner.getAnimal();
        animal.describe();

        builder1 = new CatBuilder();
        owner = new Owner(builder1);
        owner.constructAnimal();
        animal = owner.getAnimal();
        animal.describe();

        // Prototype
        Book book1 = new Book("Les Miserables");
        System.out.println("Book 1: " + book1);
        Book book2 = (Book) book1.doClone();
        System.out.println("Book 2: " + book2);
        Author author1 = new Author("Victor Hugo");
        System.out.println("Author 1: " + author1);
        Author author2 = (Author) author1.doClone();
        System.out.println("Author 2: " + author2);

    }
}