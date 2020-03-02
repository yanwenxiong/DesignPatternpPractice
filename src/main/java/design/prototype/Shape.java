package design.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
@Getter
public abstract class Shape implements Cloneable {
    @Setter
    private String id;

    protected String type;

    abstract void draw();

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
