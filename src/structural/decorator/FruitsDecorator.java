package structural.decorator;

public class FruitsDecorator extends CakeDecorator{
    public FruitsDecorator(Cake cake) {
        super(cake);
    }
    @Override
    public void describe() {
        cake.describe();
        System.out.println("It has fruits on it.");
        tasty();
    }
    public void tasty() {
        System.out.println("It is tasty.");
    }

}
