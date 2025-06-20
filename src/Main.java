import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Vehicle;
import creational.abstractfactory.VehicleFactory;
import creational.builder.*;
import creational.factory.ShapeFactory;
import creational.prototype.Author;
import creational.prototype.Book;
import creational.singleton.SingletonExample;
import structural.adapter.DistanceClassReporter;
import structural.adapter.DistanceInfo;
import structural.adapter.DistanceObjectReporter;
import structural.bridge.*;
import structural.composite.Composite;
import structural.composite.Leaf;
import structural.decorator.*;
import structural.facade.Facade;
import structural.flyweight.Flyweight;
import structural.flyweight.FlyweightFactory;
import structural.proxy.FastThing;
import structural.proxy.Proxy;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        // CREATIONAL
         /*

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
        */

        // STRUCTURAL

        // Adapter
        DistanceInfo distanceInfo = new DistanceObjectReporter();
        testDistance(distanceInfo);
        System.out.println();

        // Composite
        testComposite();
        System.out.println();

        // Proxy
        Proxy proxy = new Proxy();
        FastThing fastThing = new FastThing();
        fastThing.sayHello();
        proxy.sayHello();
        System.out.println();

        // Flyweight
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);
            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doMath(i, i);
        }
        System.out.println();

        // Facade
        Facade facade = new Facade();
        int x = 4;
        System.out.println("Cube of " + x + ": " + facade.cubeX(x));
        System.out.println("Cube of " + x + " times 2: " + facade.cubeXTimes2(x));
        System.out.println(x + " to sixth power times 2: " + facade.xToSixthPowerTimes2(x));
        System.out.println();

        // Bridge
        Artist artist = new PortraitArtist(new OilPaint());
        artist.create();
        artist.setMedium(new Pencil());
        artist.create();
        artist = new LandscapeArtist(new Watercolor());
        artist.create();
        artist.setMedium(new OilPaint());
        artist.create();

        // Decorator
        Cake cake = new ExistingCake();
        cake.describe();
        cake = new FrostingDecorator(cake);
        cake.describe();
        cake = new FruitsDecorator(cake);
        cake.describe();
        cake = new WritingDecorator(cake);
        cake.describe();


    }

    public static void testDistance(DistanceInfo distanceInfo) {
        distanceInfo.setDistanceInkm(1000);
        System.out.println("Distance in km: " + distanceInfo.getDistanceInkm());
        System.out.println("Distance in miles: " + distanceInfo.getDistanceInMiles());
        distanceInfo.setDistanceInMiles(800);
        System.out.println("Distance in km: " + distanceInfo.getDistanceInkm());
        System.out.println("Distance in miles: " + distanceInfo.getDistanceInMiles());
    }

    public static void testComposite(){
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        Leaf leaf3 = new Leaf("Leaf3");

        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        Composite composite2 = new Composite();
        composite2.add(leaf1);
        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf3);

        System.out.println("Leaf1: ");
        leaf1.sayHello();
        System.out.println("Composite1: ");
        composite1.sayHello();
        System.out.println("Composite2: ");
        composite2.sayHello();
        System.out.println("Composite3: ");
        composite3.sayGoodbye();

    }

}