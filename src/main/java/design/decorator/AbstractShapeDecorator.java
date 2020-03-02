package design.decorator;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public abstract class AbstractShapeDecorator implements IShape{
    protected IShape shape;

    public void draw() {
        shape.draw();
    }

    public AbstractShapeDecorator(IShape shape) {
        this.shape = shape;
    }
}
