package creational.abstractfactory;

public class AirVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if ("plane".equals(type)) {
            return new Plane();
        } else if ("helicopter".equals(type)) {
            return new Helicopter();
        }
        return null;
    }
}
