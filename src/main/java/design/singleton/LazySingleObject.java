package design.singleton;

/**
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class LazySingleObject {
    private static LazySingleObject object;

    private LazySingleObject() {}

    public static synchronized LazySingleObject getInstance() {
        if (object == null) {
            object = new LazySingleObject();
        }
        return object;
    }
}
