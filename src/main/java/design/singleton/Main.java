package design.singleton;

/**
 * 使用场景: 该类只需要实例化一次, 可以重复使用对象, 防止占用过多内存资源
 * 优点: 只需要实例化一次, 可以重复使用对象
 * 缺点: 没有接口, 不能继承
 * @author yanwenxiong
 * @since 2019/9/23
 */
public class Main {
    public static void main(String[] args) {
        HungrySingleObject hungrySingleObject1 = HungrySingleObject.getInstance();
        HungrySingleObject hungrySingleObject2 = HungrySingleObject.getInstance();
        System.out.println(hungrySingleObject2 == hungrySingleObject1);
    }
}
