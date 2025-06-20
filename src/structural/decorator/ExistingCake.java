package structural.decorator;

public class ExistingCake implements Cake {
    @Override
    public void describe() {
        System.out.println("\nThere is a cake.");
    }
}
