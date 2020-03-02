package design.abstractfactory.normal;

public class ShapeFactory extends AbstractFactory {
    public IShape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    public IColor getColor(String color) {
        return null;
    }
}
