package design.factory;

/**
 * 何时使用: 不关心对象创建过程, 只关心从获取, 利用多态的特性, 从工厂中获取同一类型的某种物品
 * 优点: 1. 扩展性高 2. 不关心内部实现
 * 缺点: 每增加一个产品, 就需要增加一个具体类和对象实现
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        IShape IShape1 = shapeFactory.getShape("CIRCLE");
        IShape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        IShape IShape2 = shapeFactory.getShape("RECTANGLE");
        IShape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        IShape IShape3 = shapeFactory.getShape("SQUARE");
        IShape3.draw();
    }
}
