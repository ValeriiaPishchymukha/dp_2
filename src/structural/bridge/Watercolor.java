package structural.bridge;

public class Watercolor implements Medium {
    int time;
    public Watercolor() {
        time = 4;
    }
    @Override
    public int time() {
        System.out.println("The artist is using Watercolor");
        return time;
    }
}
