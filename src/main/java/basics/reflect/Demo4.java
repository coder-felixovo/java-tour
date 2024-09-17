package basics.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class实例
        Class personClass = Class.forName("basics.reflect.Person");

        // 获取所有public成员方法
        System.out.println("**********获取所有public成员方法**********");
        Method[] methods = personClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println();

        // 获取所有成员方法
        System.out.println("**********获取所有成员方法**********");
        Method[] methods1 = personClass.getDeclaredMethods();
        for (Method m : methods1) {
            System.out.println(m);
        }

        System.out.println();

        // 获取单个public成员方法
        System.out.println("**********获取单个public成员方法**********");
        Method m = personClass.getMethod("output1");
        System.out.println(m);
        // 创建实例
        Object obj = personClass.getConstructor().newInstance();
        // 调用方法
        m.invoke(obj);

        System.out.println();

        // 获取单个成员方法
        System.out.println("**********获取单个成员方法**********");
        Method m1 = personClass.getDeclaredMethod("print4");
        System.out.println(m1);
        // 设置允许访问
        m1.setAccessible(true);
        // 调研员方法
        m1.invoke(obj);
    }
}
