import behavioral.chain.*;
import behavioral.command.*;
import behavioral.iterator.Playlist;
import behavioral.iterator.Song;
import behavioral.mediator.*;
import behavioral.memento.BalanceInfo;
import behavioral.memento.BalanceInfoCaretaker;
import behavioral.observer.BookClub;
import behavioral.observer.BookClubMember;
import behavioral.state.AngryState;
import behavioral.state.HappyState;
import behavioral.state.Person;
import behavioral.state.SadState;
import behavioral.strategy.BikeStrategy;
import behavioral.strategy.CarStrategy;
import behavioral.strategy.Context;
import behavioral.strategy.Strategy;
import behavioral.template.BreakfastMeal;
import behavioral.template.Meal;
import behavioral.template.PastaMeal;
import behavioral.visitor.*;
import structural.adapter.DistanceInfo;
import structural.composite.Composite;
import structural.composite.Leaf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        /*
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
        */

        // BEHAVIORAL
        // Template
        Meal pasta = new PastaMeal();
        pasta.doMeal();

        System.out.println();

        Meal breakfast = new BreakfastMeal();
        breakfast.doMeal();
        System.out.println();

        // Mediator
        Mediator mediator = new Mediator();
        Buyer swedishBuyer = new SwedishBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator,
                sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        float swedishBidInKronor = 55.0f;
        while (!swedishBuyer.attemptToPurchase(swedishBidInKronor)) {
            swedishBidInKronor += 15.0f;
        }
        float frenchBidInEuros = 3.0f;
        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5f;
        }

        // Chain of Responsibility
        PlanetHandler chain = setUpChain();
        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);

        // Observer
        BookClub bookClub = new BookClub("Old Book");
        BookClubMember obs1 = new BookClubMember("George");
        BookClubMember obs2 = new BookClubMember("Laura");
        BookClubMember obs3 = new BookClubMember("Sara");
        bookClub.addObserver(obs1);
        bookClub.addObserver(obs2);
        bookClub.addObserver(obs3);
        bookClub.addNewBook("New Book 1");
        bookClub.removeObserver(obs2);
        bookClub.addNewBook("New Book 2");

        // Strategy
        int distance = 10;
        Strategy carStrategy = new CarStrategy();
        Context context = new Context(distance, carStrategy);
        System.out.println("Is the distance (" + context.getTemperatureInkm() + "km) good for taking a car? ");
        context.getResult();
        Strategy bikeStrategy = new BikeStrategy();
        context.setStrategy(bikeStrategy);
        System.out.println("Is the distance (" + context.getTemperatureInkm() + "km) good for taking a bike? ");
        context.getResult();
        System.out.println();

        // Command
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        LightInvoker lightInvoker = new LightInvoker(lightOn);
        lightInvoker.invoke();
        lightInvoker.setCommand(lightOff);
        lightInvoker.invoke();
        System.out.println();

        // State
        Person person = new Person(new HappyState());
        System.out.println("Happy state: " + person.saySomething());
        person.setEmotionalState(new SadState());
        System.out.println("Sad state: " + person.saySomething());
        person.setEmotionalState(new AngryState());
        System.out.println("Angry state: " + person.saySomething());

        //Visitor
        TwoElement two1 = new TwoElement(3, 3);
        TwoElement two2 = new TwoElement(2, 7);
        ThreeElement three1 = new ThreeElement(3, 4, 5);
        List<NumberElement> numberElements = new ArrayList<NumberElement>();
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);
        System.out.println("SumVisitor: ");
        NumberVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(numberElements);
        System.out.println("\nTotalSumVisitor: ");
        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(numberElements);
        System.out.println("Total sum:" + totalSumVisitor.getTotalSum());
        System.out.println();

        // Iterator
        Song s1 = new Song("Song 1", "Artist 1");
        Song s2 = new Song("Song 2", "Artist 2");
        Song s3 = new Song("Song 3", "Artist 3");
        Playlist playlist = new Playlist();
        playlist.addItem(s1);
        playlist.addItem(s2);
        playlist.addItem(s3);
        System.out.println("Displaying Playlist: ");
        Iterator<Song> iterator = playlist.iterator();
        while (iterator.hasNext()) {
            Song item = iterator.next();
            System.out.println(item);
        }
        System.out.println("\nRemoving last song");
        iterator.remove();
        System.out.println("\nDisplaying Menu:");
        iterator = playlist.iterator();
        while (iterator.hasNext()) {
            Song item = iterator.next();
            System.out.println(item);
        }

        // Memento
        BalanceInfoCaretaker balanceInfoCaretaker = new BalanceInfoCaretaker();

        BalanceInfo balanceInfo = new BalanceInfo("Fred", 1, 1650);
        System.out.println(balanceInfo);
        balanceInfo.setDayNumberAndBalance(2, 1580);
        System.out.println(balanceInfo);
        System.out.println("Saving state.");
        balanceInfoCaretaker.saveState(balanceInfo);
        balanceInfo.setDayNumberAndBalance(3, 1520);
        System.out.println(balanceInfo);
        balanceInfo.setDayNumberAndBalance(4, 1750);
        System.out.println(balanceInfo);
        System.out.println("Restoring saved state.");
        balanceInfoCaretaker.restoreState(balanceInfo);
        System.out.println(balanceInfo);

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

    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();
        PlanetHandler others = new OtherPlanets();
        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        earthHandler.setSuccessor(others);
        return mercuryHandler;
    }


}