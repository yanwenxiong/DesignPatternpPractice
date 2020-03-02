package design.singleton;

/**
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class HungrySingleObject {
    private static HungrySingleObject hungrySingleObject = new HungrySingleObject();

    private HungrySingleObject() {

    }

    public static HungrySingleObject getInstance() {
        return hungrySingleObject;
    }

    public void showMessage() {
        System.out.println("hello world");
    }

}
