package structural.decorator;

public class WritingDecorator extends CakeDecorator{
    public WritingDecorator(Cake cake) {
        super(cake);
    }
    @Override
    public void describe() {
        cake.describe();
        System.out.println("It has writing on it.");
        funny();
    }
    public void funny() {
        System.out.println("It is funny.");
    }
}
