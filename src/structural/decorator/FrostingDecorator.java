package structural.decorator;

public class FrostingDecorator extends CakeDecorator{
    public FrostingDecorator(Cake cake) {
        super(cake);
    }
    @Override
    public void describe() {
        cake.describe();
        System.out.println("It has frosting.");
        nice();
    }
    public void nice() {
        System.out.println("It looks nice.");
    }
}
