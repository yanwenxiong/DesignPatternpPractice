package design.prototype;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}