package structural.bridge;

public abstract class Artist {
    Medium medium;
    public abstract void create();
    public void setMedium(Medium medium) {
        this.medium = medium;
    }
    public void reportOnTime(int time, String type) {
        if (time >= 40) {
            System.out.println("The " + type + " will take a long time.");
        } else if (time >= 5) {
            System.out.println("The " + type + " will take an average time.");
        } else {
            System.out.println("The " + type + " will take a little time.");
        }
    }
}

