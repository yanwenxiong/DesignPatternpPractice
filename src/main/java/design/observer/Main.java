package design.observer;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ChineseObserver chineseObserver = new ChineseObserver(subject);
        EnglishObserver englishObserver = new EnglishObserver(subject);
        subject.setState(1);
        subject.setState(0);
    }
}
