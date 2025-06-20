package structural.adapter;

public class DistanceClassReporter extends MetricReporter implements DistanceInfo {
    @Override
    public double getDistanceInkm() {
        return distanceInkm;
    }
    @Override
    public double getDistanceInMiles() {
        return kmToMiles(distanceInkm);
    }
    @Override
    public void setDistanceInkm(double distanceInkm) {
        this.distanceInkm = distanceInkm;
    }
    @Override
    public void setDistanceInMiles(double distanceInMiles) {
        this.distanceInkm = milesToKm(distanceInMiles);
    }
    private double milesToKm(double miles) {
        return miles * 1.60934;
    }

    private double kmToMiles(double km) {
        return km * 0.621371;
    }
}