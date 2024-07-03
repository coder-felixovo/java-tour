package designpattern.creationalpattern.singleton;

import java.io.Serializable;

/**
 * 单例模式 --- 懒汉式（静态内部类）
 */
public class Singleton2 implements Serializable {
    private Singleton2() {
        // 防止单例实例被反射破坏
        if (SingletonInner.INSTANCE != null) {
            throw new RuntimeException("已创建单例实例");
        }
    }

    private static class SingletonInner {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public void print() {
        System.out.println("懒汉式（静态内部类）实现单例模式");
    }

    public static Singleton2 getInstance() {
        return SingletonInner.INSTANCE;
    }

    // 防止单例实例被序列化破坏
    private Object readResolve() {
        return SingletonInner.INSTANCE;
    }
}
