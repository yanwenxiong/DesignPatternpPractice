package design.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanwenxiong
 * @since 2019/9/24
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Getter
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
