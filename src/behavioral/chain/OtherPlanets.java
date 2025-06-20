package behavioral.chain;

public class OtherPlanets extends PlanetHandler{
    public void handleRequest(PlanetEnum request) {
        if (request != PlanetEnum.MERCURY && request != PlanetEnum.VENUS && request != PlanetEnum.EARTH) {
            System.out.println("Other Planets handle " + request);
            System.out.println("They are not comfortable.\n");
        }
    }
}
