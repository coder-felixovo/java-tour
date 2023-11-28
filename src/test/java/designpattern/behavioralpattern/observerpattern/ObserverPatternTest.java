package designpattern.behavioralpattern.observerpattern;

import org.junit.Test;

public class ObserverPatternTest {
    @Test
    public void client() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        WxUser user1 = new WxUser("zhangsan");
        WxUser user2 = new WxUser("lisi");
        WxUser user3 = new WxUser("wangwu");

        concreteSubject.registerObserver(user1);
        concreteSubject.registerObserver(user2);
        concreteSubject.registerObserver(user3);

        concreteSubject.notifyObserver("Java special column had been updated.");
    }
}
