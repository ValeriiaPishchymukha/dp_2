package structural.bridge;

public class LandscapeArtist extends Artist {
    public LandscapeArtist(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void create() {
        System.out.println("\nThe artist is drawing a landscape.");
        int time = medium.time();
        reportOnTime(time, "landscape");
    }
}
