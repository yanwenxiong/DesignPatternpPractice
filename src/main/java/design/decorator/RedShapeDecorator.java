package design.decorator;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border color : red");
    }
}
