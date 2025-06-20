package behavioral.strategy;

public class Context {
    int distance;
    Strategy strategy;
    public Context(int distance, Strategy strategy) {
        this.distance = distance;
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public int getTemperatureInkm() {
        return distance;
    }
    public void getResult() {
        if (strategy.checkDistance(distance)) System.out.println("Yes, it is.");
        else System.out.println("No, not really.");
    }

}
