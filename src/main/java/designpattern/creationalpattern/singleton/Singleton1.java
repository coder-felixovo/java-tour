package designpattern.creationalpattern.singleton;

/**
 * 单例模式 --- 懒汉式（双重锁）
 */
public class Singleton1 {
    // 静态成员变量，存储类的唯一实例
    private static volatile Singleton1 INSTANCE;

    // 私有构造方法，防止外部对其实例化
    private Singleton1() {}

    public void print() {
        System.out.println("懒汉式（双重锁）实现单例模式");
    }

    public static Singleton1 getInstance() {
        if (Singleton1.INSTANCE == null) {
            synchronized (Singleton1.class) {
                if (Singleton1.INSTANCE == null) {
                    Singleton1.INSTANCE = new Singleton1();
                }
            }
        }
        return Singleton1.INSTANCE;
    }
}
