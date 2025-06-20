package structural.adapter;

public class DistanceObjectReporter implements DistanceInfo {
    MetricReporter metricReporter;
    public DistanceObjectReporter() {
        metricReporter = new MetricReporter();
    }
    @Override
    public double getDistanceInkm() {
        return metricReporter.getDistance();
    }
    @Override
    public double getDistanceInMiles() {
        return kmToMiles(metricReporter.getDistance());
    }
    @Override
    public void setDistanceInkm(double distanceInkm) {
        metricReporter.setDistance(distanceInkm);
    }
    @Override
    public void setDistanceInMiles(double distanceInMiles) {
        metricReporter.setDistance(milesToKm(distanceInMiles));
    }
    private double milesToKm(double miles) {
        return miles * 1.60934;
    }

    private double kmToMiles(double km) {
        return km * 0.621371;
    }
}
