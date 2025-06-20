package structural.bridge;

public class PortraitArtist extends Artist {
    public PortraitArtist(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void create() {
        System.out.println("\nThe artist is drawing a portrait.");
        int time = medium.time();
        reportOnTime(time, "portrait");
    }

}
