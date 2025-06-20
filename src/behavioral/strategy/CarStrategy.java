package behavioral.strategy;

public class CarStrategy implements Strategy {
    @Override
    public boolean checkDistance(int distance) {
        return distance > 20;
    }

}