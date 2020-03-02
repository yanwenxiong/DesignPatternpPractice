package design.abstractfactory.normal;

public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("blue").fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("circle").draw();
        shapeFactory.getShape("rectangle").draw();

    }
}
