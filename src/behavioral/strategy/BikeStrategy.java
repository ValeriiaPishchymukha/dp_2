package behavioral.strategy;

public class BikeStrategy implements Strategy {
    @Override
    public boolean checkDistance(int distance) {
        return (distance > 3) && (distance <= 20);
    }

}
