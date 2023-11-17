package designpattern.creationalpattern.singleton;

public class Singleton {

    // 引用唯一实例
    private static final Singleton instance = new Singleton();

    // 防止外部实例化
    private Singleton() {}

    // 获取实例
    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        String name = "单例";
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
