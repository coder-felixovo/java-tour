package designpattern.behavioralpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 */
public class ConcreteSubject implements Subject {
    private List<Observer> wxUserList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        wxUserList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        wxUserList.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : wxUserList) {
            observer.update(message);
        }
    }
}
