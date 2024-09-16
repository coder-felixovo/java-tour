package reflect;

import basics.reflect.TargetObject;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TargetObjectTest {
    /**
     * 获取Class对象的四种方式
     */
    @Test
    public void test1() throws ClassNotFoundException {
        // 1. 知道具体类
        Class targetObjectClass = TargetObject.class;

        // 2. 传入类的全路径
        Class targetObjectClass2 = Class.forName("basics.reflect.TargetObject");

        // 3. 通过对象的实例获取
        TargetObject to = new TargetObject();
        Class targetObjectClass3 = to.getClass();

        // 4. 通过类加载器传入类路径获取
        Class targetObjectClass4 = ClassLoader.getSystemClassLoader().loadClass("basics.reflect.TargetObject");

        System.out.println(targetObjectClass);
        System.out.println(targetObjectClass2);
        System.out.println(targetObjectClass3);
        System.out.println(targetObjectClass4);

        // 输出: class reflect.TargetObject
    }

    /**
     * 反射的一些基本操作
     */
    @Test
    public void test2() throws Exception {
        // 获取TargetObject类的Class对象并创建实例
        Class<?> targetClass = Class.forName("basics.reflect.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        // 获取TragetObject类中定义的所有方法
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        // privateMethod
        // publicMethod

        // 获取指定参数并对参数进行修改
        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject, "Java Reflect");

        // 获取 private 方法并调用
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.invoke(targetObject); // value is Java Reflect

        // 获取 public 方法并调用
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.setAccessible(true);
        publicMethod.invoke(targetObject, "Java"); // I like Java
    }
}
