package structural.bridge;

import java.awt.*;

public class OilPaint implements Medium {
    int time;
    public OilPaint() {
        time = 60;
    }
    @Override
    public int time() {
        System.out.println("The artist is using Oil Paint");
        return time;
    }

}
