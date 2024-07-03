package designpattern.creationalpattern.singleton;

/**
 * 单例模式 --- 饿汉式
 */
public class Singleton {

    // 静态成员变量，存储类的唯一实例
    private static final Singleton INSTANCE = new Singleton();

    // 私有构造方法，防止外部对其实例化
    private Singleton() {}

    public void print() {
        System.out.println("饿汉式实现单例模式");
    }

    // 公共静态方法，提供外部访问实例的入口
    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}
