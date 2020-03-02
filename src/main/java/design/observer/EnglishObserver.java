package design.observer;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class EnglishObserver extends Observer {
    public EnglishObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("have observed subject state change to " + subject.getState());
    }
}
