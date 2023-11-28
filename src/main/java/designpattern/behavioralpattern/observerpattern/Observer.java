package designpattern.behavioralpattern.observerpattern;

/**
 * Observer 抽象观察者，为所有具体观察者定义一个接口，在得到主题通知时更新自己
 */
public interface Observer {
    void update(String message);
}
