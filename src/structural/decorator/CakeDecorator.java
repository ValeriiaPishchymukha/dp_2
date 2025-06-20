package structural.decorator;

public abstract class CakeDecorator implements Cake {
    Cake cake;
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
}
