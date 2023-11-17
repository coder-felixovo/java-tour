package designpattern.creationalpattern;

import designpattern.creationalpattern.singleton.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // 无法实例化
//        Singleton singleton = new Singleton();

        // 获取实例
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
    }
}
