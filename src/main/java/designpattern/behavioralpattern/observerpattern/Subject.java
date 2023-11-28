package designpattern.behavioralpattern.observerpattern;

/**
 * Subject 抽象主题，规定具体主题需要实现的方法
 */
public interface Subject {
    /** 增加观察者 */
    void registerObserver(Observer observer);
    /** 移除观察者 */
    void removeObserver(Observer observer);
    /** 通知观察者 */
    void notifyObserver(String   message);
}
