package design.observer;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class ChineseObserver extends Observer {
    public ChineseObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("观察到subject变动了state = " + subject.getState());
    }
}
