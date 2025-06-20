package behavioral.strategy;

public class WalkingStrategy implements Strategy {
    @Override
    public boolean checkDistance(int distance) {
        return distance <= 3;
    }
}
