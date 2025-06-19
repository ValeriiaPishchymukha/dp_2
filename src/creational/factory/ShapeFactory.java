package creational.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("triangle".equals(type)) {
            return new Triangle();
        } else if ("circle".equals(type)) {
            return new Circle();
        }
        else if ("rectangle".equals(type)) {
            return new Rectangle();
        }
        return null;
    }
}

