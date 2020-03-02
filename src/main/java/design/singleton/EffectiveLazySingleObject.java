package design.singleton;

/**
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class EffectiveLazySingleObject {
    private volatile static EffectiveLazySingleObject object;

    private EffectiveLazySingleObject() {

    }

    public static EffectiveLazySingleObject getInstance() {
        if (object == null) {
            synchronized (EffectiveLazySingleObject.class) {
                if (object == null) {
                    object = new EffectiveLazySingleObject();
                }
            }
        }
        return object;
    }
}
