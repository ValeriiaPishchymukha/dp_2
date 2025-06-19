package creational.abstractfactory;

public class LandVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if ("car".equals(type)) {
            return new Car();
        } else if ("truck".equals(type)) {
            return new Truck();
        }
        return null;
    }
}
