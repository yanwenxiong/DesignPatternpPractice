package design.abstractfactory.normal;

public class ColorFactory extends AbstractFactory {
    public IShape getShape(String shape) {
        return null;
    }

    public IColor getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }
}
