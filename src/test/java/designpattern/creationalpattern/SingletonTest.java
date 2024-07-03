package designpattern.creationalpattern;

import designpattern.creationalpattern.singleton.Singleton;
import designpattern.creationalpattern.singleton.Singleton1;
import designpattern.creationalpattern.singleton.Singleton2;
import designpattern.creationalpattern.singleton.Singleton3;
import org.junit.Test;

/**
 * 单例模式实现测试
 */
public class SingletonTest {

    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }

    @Test
    public void test1() {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.print();
    }

    @Test
    public void test2() {
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.print();
    }

    @Test
    public void test3() {
        Singleton3 singleton3 = Singleton3.INSTANCE;
        singleton3.print();
    }
}
