package design.observer;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public abstract class Observer {
    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    public abstract void update();
}
