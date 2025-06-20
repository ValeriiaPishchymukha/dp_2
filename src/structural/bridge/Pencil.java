package structural.bridge;

public class Pencil implements Medium {
    int time;
    public Pencil() {
        time = 10;
    }
    @Override
    public int time() {
        System.out.println("The artist is using Pencil");
        return time;
    }
}