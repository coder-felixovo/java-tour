package basics.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取构造方法
 */
public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class实例
        Class personClass = Class.forName("basics.reflect.Person");

        // 1. 获取所有public构造方法
        // public Constructor[] getConstructors()
        System.out.println("**********获取所有public构造方法**********");
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println();

        // 2. 获取所有构造方法
        // public Constructor[] getDeclaredConstructors()
        System.out.println("**********获取所有构造方法**********");
        Constructor[] constructors1 = personClass.getDeclaredConstructors();
        for (Constructor c : constructors1) {
            System.out.println(c);
        }

        System.out.println();

        // 3. 获取单个public构造方法
        // public Constructor getConstructor(Class... parameterTypes)
        // 参数需要传入参数类型；如果是public无参构造函数，则传null

        System.out.println("**********获取public无参构造方法**********");
        Constructor constructor = personClass.getConstructor(null);
        System.out.println(constructor);

        // 调用构造方法
        Object obj = constructor.newInstance();
        System.out.println(obj.toString());

        System.out.println();

        System.out.println("**********获取public全参构造方法**********");
        Constructor constructor1 = personClass.getConstructor(String.class, int.class, boolean.class);
        System.out.println(constructor1);

        System.out.println();

        // 4. 获取单个构造方法
        // public Constructor getDeclaredConstructor(Class... parameterTypes)

        // 获取私有构造方法
        System.out.println("**********获取私有构造方法**********");
        Constructor constructor2 = personClass.getDeclaredConstructor(int.class);
        System.out.println(constructor2);
        // 设置允许访问
        constructor2.setAccessible(true);
        // 调用构造方法
        Object object2 = constructor2.newInstance(18);
        System.out.println(object2);
    }
}
