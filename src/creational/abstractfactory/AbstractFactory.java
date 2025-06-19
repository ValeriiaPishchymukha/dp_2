package creational.abstractfactory;

public class AbstractFactory{
    public VehicleFactory getVehicleFactory(String type) {
        if ("land".equals(type)) {
            return new LandVehicleFactory();
        } else if ("air".equals(type)){
            return new AirVehicleFactory();
        }
        return null;
    }
}
