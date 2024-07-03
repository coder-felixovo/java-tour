package designpattern.creationalpattern;

import designpattern.creationalpattern.singleton.Singleton2;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式测试
 */
public class SingletonTest3 {
    public static void main(String[] args) throws Exception {
        // 获取Singletion2类的字节码；
        Class<Singleton2> singletonClass = Singleton2.class;
        // 获取无参构造方法，用来创建对象。
        Constructor<Singleton2> con = singletonClass.getDeclaredConstructor();
        // 改变访问策略
        con.setAccessible(true);
        // 创建对象
        Singleton2 s1 = con.newInstance();
        Singleton2 s2 = con.newInstance();
        System.out.println(s1 == s2); // false
    }
}
