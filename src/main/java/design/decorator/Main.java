package design.decorator;

/**
 * 使用场景: 动态的给对象增加一些额外的职责, 在不想用继承方式的时候, 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 * 优点: 装饰类和被装饰类独立发展,可以动态扩展一个类的功能
 * 缺点: 多层装饰比较复杂
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(circle);

        System.out.println("normal:");
        circle.draw();
        System.out.println("----------------");

        System.out.println("red decorator:");
        redShapeDecorator.draw();
        System.out.println("----------------");

        System.out.println("blue decorator:");
        blueShapeDecorator.draw();
    }
}
