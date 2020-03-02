package design.prototype;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}