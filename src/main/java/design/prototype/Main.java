package design.prototype;

/**
 * 使用场景: 利用已有的一个原型对象，快速地生成和原型对象一样的实例
 * 优点: 1. 提高性能
 * 缺点: 1. 实现Cloneable接口需要做很多考虑;这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}
